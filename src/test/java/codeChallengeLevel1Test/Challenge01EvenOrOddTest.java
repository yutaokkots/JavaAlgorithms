package codeChallengeLevel1Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.example.codeChallengeLevel1.Challenge01EvenOrOdd;

import org.junit.Test;

public class Challenge01EvenOrOddTest {
    @Test
    public void isEven_true() {
        assertTrue(Challenge01EvenOrOdd.isEven(0));
        assertTrue(Challenge01EvenOrOdd.isEven(2));
        assertTrue(Challenge01EvenOrOdd.isEven(4));
        assertTrue(Challenge01EvenOrOdd.isEven(6));
        assertTrue(Challenge01EvenOrOdd.isEven(8));
        assertTrue(Challenge01EvenOrOdd.isEven(-20));
        assertTrue(Challenge01EvenOrOdd.isEven(100));
        assertTrue(Challenge01EvenOrOdd.isEven(-46));
    }

    @Test
    public void isEven_false() {
        assertFalse(Challenge01EvenOrOdd.isEven(1));
        assertFalse(Challenge01EvenOrOdd.isEven(3));
        assertFalse(Challenge01EvenOrOdd.isEven(5));
        assertFalse(Challenge01EvenOrOdd.isEven(7));
        assertFalse(Challenge01EvenOrOdd.isEven(9));
        assertFalse(Challenge01EvenOrOdd.isEven(-11));
        assertFalse(Challenge01EvenOrOdd.isEven(93));
        assertFalse(Challenge01EvenOrOdd.isEven(-75));
    }
}

