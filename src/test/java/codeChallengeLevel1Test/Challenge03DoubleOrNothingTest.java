package codeChallengeLevel1Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.example.codeChallengeLevel1.Challenge03DoubleOrNothing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Challenge03DoubleOrNothingTest {
    private final ByteArrayOutputStream gamePrintOut = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(gamePrintOut));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void askUserToContinue_YES() {

        String input = "yes";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Challenge03DoubleOrNothing game = new Challenge03DoubleOrNothing();
        assertTrue(game.getIsStillPlaying());

        game.askUserToContinue();
        assertTrue(game.getIsStillPlaying());
        assertEquals("Would you like to continue and try to double your winnings? Enter YES to continue\n",
                gamePrintOut.toString());
    }

    @Test
    public void askUserToContinue_NO() {
        String input = "no";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Challenge03DoubleOrNothing game = new Challenge03DoubleOrNothing();
        assertTrue(game.getIsStillPlaying());

        game.askUserToContinue();
        assertFalse(game.getIsStillPlaying());
        assertEquals("Would you like to continue and try to double your winnings? Enter YES to continue\n",
                gamePrintOut.toString());
    }

}
