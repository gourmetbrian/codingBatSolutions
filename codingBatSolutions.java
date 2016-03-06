//Coding Bat solutions

//Arrays


//Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

public int[] make2(int[] a, int[] b) {
        int[] res = new int[2];

        if ( a.length >= 2 )
        {
                res[0] = a[0];
                res[1] = a[1];
        }

        else if ( a.length == 1)
        {
                res[0] = a[0];
                res[1] = b[0];
        }

        else
        {
                res[0] = b[0];
                res[1] = b[1];
        }
        return res;
}

//Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

public int[] front11(int[] a, int[] b) {
        int resSize = 2;
        if (a.length == 0 && b.length == 0)
        {
                resSize = 0;
        }

        if (a.length > 0 && b.length == 0 || a.length == 0 && b.length > 0) {
                resSize = 1;
        }

        int[] res = new int[resSize];

        if (a.length == 0 && b.length > 0)
        {
                res[0] = b[0];
        }

        else if (b.length == 0 && a.length > 0)
        {
                res[0] = a[0];
        }
        else if (resSize == 2) {
                res[0] = a[0];
                res[1] = b[0];
        }
        return res;

}


//Logic

// Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
                return (n <= 1 || n >= 10);
        } else {
                return (n >= 1 && n <= 10);
        }
}

//We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod

public boolean specialEleven(int n) {

        return (n % 11 == 0 || n % 11 == 1 );

}


// Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

public boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
}


// Return true if the given non-negative number is a multiple of 3 or 5, but not both.

public boolean old35(int n) {
        if (!(n % 3 == 0 && n % 5 == 0))
        {
                return ( n % 3 == 0 || n % 5 == 0 );
        }
        else
        {
                return false;
        }
}

// Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.

public boolean less20(int n) {
        return ( n % 20 == 19 || n % 20 == 18 );
}

// Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

public boolean nearTen(int num) {
        return (num % 10 == 2 || num % 10 == 1 || num % 10 == 8 || num % 10 == 9 || num % 10 == 0);
}
// Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

public int teenSum(int a, int b) {
        if ( a >= 13 && a <= 19 || b >= 13 && b <= 19 )
        {
                return 19;
        }

        else
        {
                return a + b;
        }
}

// Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
if (isMorning && isMom && !isAsleep)
{
return true;
}
if (!isMorning && !isAsleep)
{
return true;
}
return false;
}
