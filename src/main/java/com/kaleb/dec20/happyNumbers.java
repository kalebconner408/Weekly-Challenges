package com.kaleb.dec20;

public class happyNumbers
{
    public static boolean happy(int value)
    {
        // set this problem up so that we have the first digit
        // and the rest of the digits in another value
        int curNumber = value;

        while (curNumber != 1)
        {
            int curDigit = curNumber % 10;
            int nextDigits = curNumber / 10;
            int sum = 0;
            if (curNumber == 4)
                return false;
            // count the sum of all the squares of each digit
            do
            {
                sum += (curDigit * curDigit);
                curDigit = nextDigits % 10;
                nextDigits = nextDigits / 10;
            }
            while(nextDigits != 0);
            sum += curDigit * curDigit;
            curNumber = sum;
            System.out.println(curNumber);
        }
        return true;
    }
}
