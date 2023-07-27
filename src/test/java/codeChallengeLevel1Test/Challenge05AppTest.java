package codeChallengeLevel1Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.example.codeChallengeLevel1.Challenge05ModelAPerson;
import org.junit.Test;

public class Challenge05AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Challenge05ModelAPerson personA = new Challenge05ModelAPerson("john", "hugh", 25);
        assertEquals("hi! My name is john hugh.", personA.greeting());
    }
}