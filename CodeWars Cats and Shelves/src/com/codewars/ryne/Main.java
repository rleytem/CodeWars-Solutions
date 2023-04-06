package com.codewars.ryne;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution(1,5));
    }

    public static int solution(int start, int finish) {
        //very simple, per the description, finish and start will always be positive and finish will
        //always be larger than start. so we simply subtract start from finish and we have the distance between
        //the two shelves.
        //Jumps between the shelves are either 1 or 3, so we assume the cat will jump the maximum number of shelves
        //first before being able to only do one jump at a time.
        //we translate that to code by dividing the distance by three  and adding the distance modulo 3 as well. This
        //is the minimum number of jumps needed
        int distance = finish - start;
        int numOfJumps = ((distance / 3) + distance % 3);

        return numOfJumps;
    }
}
