package com.kaleb.dec20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class heteromecicTest
{
    @Test
    void zero()
    {
        assertTrue(com.kaleb.dec20.heteromecic.isHeteromecic(0));
    }

    @Test
    void two()
    {
        assertTrue(com.kaleb.dec20.heteromecic.isHeteromecic(2));
    }

    @Test
    void seven()
    {
        assertFalse(com.kaleb.dec20.heteromecic.isHeteromecic(7));
    }
    @Test
    void oneHundredTen()
    {
        assertTrue(com.kaleb.dec20.heteromecic.isHeteromecic(110));
    }
}
