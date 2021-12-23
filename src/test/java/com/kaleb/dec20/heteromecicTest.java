package com.kaleb.dec20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class heteromecicTest
{
    @Test
    void test0()
    {
        assertTrue(com.kaleb.dec20.heteromecic.isHeteromecic(0));
    }

    @Test
    void test2()
    {
        assertTrue(com.kaleb.dec20.heteromecic.isHeteromecic(2));
    }

    @Test
    void test7()
    {
        assertFalse(com.kaleb.dec20.heteromecic.isHeteromecic(7));
    }
    @Test
    void test110()
    {
        assertTrue(com.kaleb.dec20.heteromecic.isHeteromecic(110));
    }
}
