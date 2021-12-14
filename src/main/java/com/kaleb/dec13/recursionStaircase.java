package com.kaleb.dec13;

public class recursionStaircase
{
    public static int staircase(int steps)
    {
        if (steps == 0)
            return 1;
        int count = 0;
        if (steps >= 2)
            count += staircase(steps - 2);
        if (steps >= 1)
            count += staircase(steps - 1);
        return count;
    }
}
