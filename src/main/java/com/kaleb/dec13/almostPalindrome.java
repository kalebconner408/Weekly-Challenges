package com.kaleb.dec13;

import java.util.Locale;

public class almostPalindrome
{
    public static boolean isAlmostPalindrome(String input)
    {
        String sanitized = input.toLowerCase(Locale.ROOT);
        StringBuilder lower = new StringBuilder(sanitized.substring(0, (sanitized.length() / 2)));
        StringBuilder upper = new StringBuilder(sanitized.substring(sanitized.length() / 2)).reverse();

        int count = 0;
        for (int i=0; i<lower.length(); i++)
        {
            if (lower.charAt(i) != upper.charAt(i))
                count++;
            if (count > 1)
                return false;
        }
        if (count == 1)
            return true;
        return false;
    }
}
