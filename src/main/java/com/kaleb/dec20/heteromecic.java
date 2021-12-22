package com.kaleb.dec20;

public class heteromecic
{
    public static boolean isHeteromecic(int value)
    {
        int half;
        try
        {
            half = value / 2;
        }
        catch (Exception e)
        {
            half = 0;
        }

        for (int i=0; i<=half;i++)
        {
            if ((i * (i+1)) == value)
                return true;
        }
        return false;
    }
}
