package codeChallengeLevel1Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.example.codeChallengeLevel1.Challenge01PasswordComplexity;
import org.junit.Test;
public class Challenge02PasswordComplexityTest {
    @Test
    public void isPasswordComplex_true() {
        assertTrue(Challenge01PasswordComplexity.isPasswordComplex("Happy12"));
        assertTrue(Challenge01PasswordComplexity.isPasswordComplex("1SarahL ength"));
        assertTrue(Challenge01PasswordComplexity.isPasswordComplex("Password12"));
        assertTrue(Challenge01PasswordComplexity.isPasswordComplex("2PassW@ord1"));
        assertTrue(Challenge01PasswordComplexity.isPasswordComplex("01Sall#y9"));
    }

    @Test
    public void isPasswordComplex_false() {
        assertFalse(Challenge01PasswordComplexity.isPasswordComplex("12aB "));
        assertFalse(Challenge01PasswordComplexity.isPasswordComplex("Ab112"));
        assertFalse(Challenge01PasswordComplexity.isPasswordComplex("happy"));
        assertFalse(Challenge01PasswordComplexity.isPasswordComplex("happy_1"));
        assertFalse(Challenge01PasswordComplexity.isPasswordComplex("p assword12"));
        assertFalse(Challenge01PasswordComplexity.isPasswordComplex("Sur18"));
        assertFalse(Challenge01PasswordComplexity.isPasswordComplex(""));
    }
}
