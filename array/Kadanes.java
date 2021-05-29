package com.devloafer.geeksforgeeks.array;

public class Kadanes {

    public int solve(int A[])
    {
        int max_end_here = 0;
        int max_so_for = 0;

        for(int i =0; i < A.length; i++)
        {
            max_end_here +=A[i];
            max_so_for = Math.max(max_so_for, max_end_here);
            max_end_here = Math.max(max_end_here, 0);
        }

        return max_so_for;
    }
}
