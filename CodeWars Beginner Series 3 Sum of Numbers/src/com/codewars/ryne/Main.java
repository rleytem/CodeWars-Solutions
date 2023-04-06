package com.codewars.ryne;

public class Main {
//    Given two integers a and b, which can be positive or negative, find the sum of all the integers
//    between and including them and return it. If the two numbers are equal return a or b.
//
//    Note: a and b are not ordered!
//    Examples (a, b) --> output (explanation)
//
//    (1, 0) --> 1 (1 + 0 = 1)
//    (1, 2) --> 3 (1 + 2 = 3)
//    (0, 1) --> 1 (0 + 1 = 1)
//    (1, 1) --> 1 (1 since both are same)
//    (-1, 0) --> -1 (-1 + 0 = -1)
//    (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
//
//    Your function should only return a number, not the explanation about how you get that number.


    public static void main(String[] args) {

        System.out.println(GetSum(2,-1));
        System.out.println(GetSum(0,1));


    }

    public static int GetSum(int a, int b) {

        //two int variables set up, one the sum we're going to return, the other to be a temp variable
        //the temp is purely to swap the two integers if b is less than a, that way we only have one for loop
        //for loop starts at a and ends with b, stores the numbers in sum
        //returns sum

        int sum = 0;
        int temp;

        if (b < a) {
            temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }
}
