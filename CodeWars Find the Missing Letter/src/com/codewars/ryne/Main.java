package com.codewars.ryne;

public class Main {

//    Write a method that takes an array of consecutive (increasing) letters as input and that returns the
//    missing letter in the array.
//
//    You will always get an valid array. And it will be always exactly one letter be missing. The length
//    of the array will always be at least 2.
//    The array will always contain letters in only one case.
//
//    Example:
//
//            ['a','b','c','d','f'] -> 'e'
//            ['O','Q','R','S'] -> 'P'
//
//            (Use the English alphabet with 26 letters!)


    public static void main(String[] args) {
        char[] test = new char[] { 'a','b','c','d','f' };
        char[] test2 = new char[] { 'O','Q','R','S' };
        System.out.println(findMissingLetter(test));
        System.out.println(findMissingLetter(test2));


    }

    public static char findMissingLetter(char[] array) {

        //personally, I do not like this code, it's pretty gross, but we can always refactor and make better?
        //I didn't research it too much but I was worried that just converting the char to lowercase or uppercase first
        //and converting it back later may not work with my unicode method below, so I just decided to do it the same
        //no matter what if it was upper or lower case, the same method works for both

        //we create two new arrays in type INT with the length of the passed in array;
        //we also create a missing char that we will return later as the method returns a char
        //
        //the for loop loops through the array and adds the index of the array to the int array, testArray
        //we convert the char of array to unicode using codePointat, this returns an int of the unicode of the char
        //we then do another for loop for our "CONTROL" int array. this takes the first value of the testArray/array
        //and adds that value plus the iterator to the control indexof.
        //this is saying that whatever unicode of the alphabet we're on, the correct order is going to look like this...
        //final for loop tests testArray index against control index, the moment it doesnt equal each other
        //we grab the control's index and set it to missing and break;
        //finally return the missing char

        int[] testArray = new int[array.length];
        int[] control = new int[array.length];
        char missing =' ';

        for (int i = 0; i < array.length; i++) {
            testArray[i] = Character.codePointAt(array,i);
        }

        for (int i = 0; i < array.length; i++) {
            control[i] = testArray[0] + i;
        }

        for (int i = 0; i < array.length; i++) {
            if (testArray[i] != control[i]) {
                missing = (char)control[i];
                break;
            }
        }
        return missing;
    }
}
