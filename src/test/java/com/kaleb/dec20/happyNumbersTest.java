package com.kaleb.dec20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class happyNumbersTest
{
    @Test
    void test203()
    {
        assertTrue(happyNumbers.happy(203));
    }

    @Test
    void test11()
    {
        assertFalse(happyNumbers.happy(11));
    }

    @Test
    void test107()
    {
        assertFalse(happyNumbers.happy(107));
    }
}
