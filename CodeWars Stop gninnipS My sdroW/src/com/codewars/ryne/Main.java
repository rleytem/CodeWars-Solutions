package com.codewars.ryne;

public class Main {

//    Write a function that takes in a string of one or more words, and returns the same string,
//    but with all five or more letter words reversed (Just like the name of this Kata).
//    Strings passed in will consist of only letters and spaces.
//    Spaces will be included only when more than one word is present.
//
//    Examples:
//
//    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//    spinWords( "This is a test") => returns "This is a test"
//    spinWords( "This is another test" )=> returns "This is rehtona test"



    public static void main(String[] args) {

        System.out.println(spinWords("Hey fellow warriors"));


    }

    public static String spinWords(String sentence) {

        //was originally going to use a String Builder but got stuck trying to convert it back to String to split it
        //most certainly theres a way to do it, but heres how I navigated through without it
        //
        //created a String array called words and took in the passed in String with a split method with whitespace regex
        //created an empty String returnString to put the final string in and return it at the end
        //for loop to go through the array and anytime the length of the word was at least 5 characters
        //we create a temp word to hold the reversed word
        //we enter a second for loop that takes the letters and adds them in front of each other, thus reversing it
        //afterwards we assign that reversed value back into the string array at index
        //
        //for the last part, we have another for loop that goes through the array once more, but adds the words
        // to return string
        //and as long as we're not on the final word, we add a space afterwards
        //finally return returnString

        String[] words = sentence.split(" ");
        String returnString = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                String temp = "";
                for (int j = 0; j < words[i].length(); j++) {
                    temp = words[i].charAt(j) + temp;
                }
                words[i] = temp;
            }
        }
        for (int i = 0; i < words.length; i++) {
            returnString += words[i];

            if (i != words.length-1) {
                returnString += " ";
            }

        }

        return returnString;
    }
}
