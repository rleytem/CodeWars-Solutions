package com.codewars.ryne;

public class Main {

    public static void main(String[] args) {

        int[] testNumber = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(createPhoneNumber(testNumber));

    }

    public static String createPhoneNumber(int[] numbers) {

        //i think this could be better optimized and less hard coded
        // but for the sheer purpose of creating a phone number, this works
        //
        // first we create the string that we will eventually return
        //this string starts with the left parenthesis already included
        //the method is made of three different four loops, one for each section of the phone number
        //first one grabs the area code numbers from the int array
        //second through the middle three digits
        //third through the last four digits of the number
        //for each loop we start the for loop at the numbers we want to pull and end them before the next set
        //in between each set of numbers we add the next corresponding piece of phone number formatting
        //for instance, in between the first and second loops we add the right parenthesis and whitespace
        //between the second and third we add the hyphen
        //finally we return our final string


        String phone = "(";

        for (int i = 0; i < 3; i++) {
            phone += String.valueOf(numbers[i]);
        }

        phone += ") ";

        for (int i = 3; i < 6; i++) {
            phone += String.valueOf(numbers[i]);
        }

        phone += "-";

        for (int i = 6; i < numbers.length; i++) {
            phone += String.valueOf(numbers[i]);
         }

        return phone;
    }
}
