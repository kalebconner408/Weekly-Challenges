package com.kaleb.dec13;

import com.kaleb.dec13.recursionStaircase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class staircaseTest
{

    @Test
    void zeroSteps()
    {
        assertEquals(1, recursionStaircase.staircase(0));
    }

    @Test
    void oneStep()
    {
        assertEquals(1, recursionStaircase.staircase(1));
    }

    @Test
    void twoStep()
    {
        assertEquals(2, recursionStaircase.staircase(2));
    }

    @Test
    void fourSteps()
    {
        assertEquals(5, recursionStaircase.staircase(4));
    }

    @Test
    void fiveSteps()
    {
        assertEquals(8, recursionStaircase.staircase(5));
    }
}
