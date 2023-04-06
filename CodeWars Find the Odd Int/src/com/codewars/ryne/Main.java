package com.codewars.ryne;

public class Main {

    public static void main(String[] args) {

//        Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//        Examples
//
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

        int[] test = {1,1,2};

        System.out.println(findIt(test));

    }

    public static int findIt(int[] a) {

        //declare and initialize oddInt which will capture the int that appeared odd times in the array
        //for each loop that iterates through each element of the array
        //set up a counter
        //for loop that goes through each element again but checks against whatever element we're currently on
        //in the for each loop
        //
        //finally we check if the count gives a remainder with modulo 2, meanining it's an odd number
        //because we're told theres only one odd int in the array then just set the oddInt as whatever num we're
        //currently on and return the oddInt

        int oddInt = 0;
        for (int num : a) {

            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (num == a[i]) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                oddInt = num;
            }
        }
        return oddInt;
    }
}
