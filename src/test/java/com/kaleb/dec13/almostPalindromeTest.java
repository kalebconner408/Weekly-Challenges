package com.kaleb.dec13;

import com.kaleb.dec13.almostPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class almostPalindromeTest
{
    // we are only looking for almost palindromes, so this test should fail
    @Test
    void fullPalindrome()
    {
        assertFalse(almostPalindrome.isAlmostPalindrome("racecar"));
    }

    // this requires more than one character change in order to be a palindrome, so this test should fail
    @Test
    void invalidAlmostPalindrome()
    {
        assertFalse(almostPalindrome.isAlmostPalindrome("abcdaaa"));
    }

    // this is one character off of being a palindrome, so this test should pass
    @Test
    void almostPalindrome()
    {
        assertTrue(almostPalindrome.isAlmostPalindrome("abcdcbg"));
    }
}
