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
