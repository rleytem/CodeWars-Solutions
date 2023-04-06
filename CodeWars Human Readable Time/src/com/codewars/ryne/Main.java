package com.codewars.ryne;

public class Main {

    public static void main(String[] args) {
//        Write a function, which takes a non-negative integer (seconds) as input and
//        returns the time in a human-readable format (HH:MM:SS)
//
//        HH = hours, padded to 2 digits, range: 00 - 99
//        MM = minutes, padded to 2 digits, range: 00 - 59
//        SS = seconds, padded to 2 digits, range: 00 - 59
//
//        The maximum time never exceeds 359999 (99:59:59)

        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));


    }

    public static String makeReadable(int seconds) {

        //seconds gets divided into minutes, which is divided into hours
        //modulo used to get the remainder seconds and remainder minutes
        //create a string but use the String.format method to display the time in the "readable" format
        // %02d says the double will be displayed will always be displayed as two digits, padded by zero
        //the other parameter of the String format method is the parameters we want displayed in the special format
        //return the time;

        int minutes = seconds / 60;
        int hours = minutes / 60;
        int remainSeconds = seconds % 60;
        int remainMinutes = minutes % 60;

        String readTIme = String.format("%02d:%02d:%02d",hours,remainMinutes,remainSeconds);

        return readTIme;
    }
}
