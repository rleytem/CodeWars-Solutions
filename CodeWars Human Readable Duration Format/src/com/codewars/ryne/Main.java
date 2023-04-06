package com.codewars.ryne;

public class Main {
//    Your task in order to complete this Kata is to write a function which formats a duration,
//    given as a number of seconds, in a human-friendly way.
//
//    The function must accept a non-negative integer. If it is zero, it just returns "now".
//    Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
//
//    It is much easier to understand with an example:
//
//            * For seconds = 62, your function should return
//            "1 minute and 2 seconds"
//            * For seconds = 3662, your function should return
//            "1 hour, 1 minute and 2 seconds"
//
//    For the purpose of this Kata, a year is 365 days and a day is 24 hours.
//
//    Note that spaces are important.
//            Detailed rules
//
//    The resulting expression is made of components like 4 seconds, 1 year, etc. In general,
//    a positive integer and one of the valid units of time, separated by a space. The unit of time
//    is used in plural if the integer is greater than 1.
//
//    The components are separated by a comma and a space (", "). Except the last component, which
//    is separated by " and ", just like it would be written in English.
//
//    A more significant units of time will occur before than a least significant one. Therefore,
//    1 second and 1 year is not correct, but 1 year and 1 second is.
//
//    Different components have different unit of times. So there is not repeated units like in 5 seconds and 1 second.
//
//    A component will not appear at all if its value happens to be zero. Hence, 1 minute and 0
//    seconds is not valid, but it should be just 1 minute.
//
//    A unit of time must be used "as much as possible". It means that the function should not return
//    61 seconds, but 1 minute and 1 second instead. Formally, the duration specified by of a component
//    must not be greater than any valid more significant unit of time.


    public static void main(String[] args) {
        System.out.println(formatDuration(486542));

    }

    public static String formatDuration(int seconds) {

        //I had to look up part of a solution to this and I couldnt figure out how to do the ", " and " and " pieces
        //correctly. So I found a solution, read it until I understood what it was doing and tried to replicate it
        //with tools I was already familliar with.
        //While I havent normally used ternary operators this really showed me the benefit of them and I enjoyed
        //using them
        //plus this showed the power of a single for loop but using the iterator, i, for different arrays.

        //first check if the seconds are zero, if so, return "now"
        //then we keep track of the seconds what theyre worth if transposed into bigger amounts
        //the variables are all the units of time converted to seconds
        //two arrays holding the seconds of each unit of time and the label for them

        //create the output of the string we'll return eventually

        //for loop that runs the length of the arrays
        //if the seconds are bigger than the units of time converted to seconds, then we divide, create a remainder and
        //set the seconds as the modulo of seconds / unit of time
        //these are whats left of our seconds after dividing them out and what we'll carry to the next iteration
        //finally take the output, if its empty, do nothing, if it already has something in it, then we have to decide
        //if we need to use an "and" or a "," to separate them out and make it look readable
        //add the quotient and the unit of time together to the output and then decide if we need to make it plural or
        //not
        //finally return the output

        if (seconds == 0) {
            return "now";
        }

        int minute = 60;
        int hour = minute * 60;
        int day = hour * 24;
        int year = day * 365;

        int[] time = new int[] {year, day, hour, minute, 1};
        String[] increments = new String[] {"year", "day", "hour", "minute", "second"};

        String output = "";

        for (int i = 0; i < time.length; i++) {
            if (seconds >= time[i]) {
                int remain = seconds / time[i];
                seconds = seconds % time[i];
                output += (output.equals("") ? "" : (seconds == 0 ? " and " : ", ")) + remain + " " + increments[i]
                        + (remain > 1 ? "s" : "");
            }
        }

        return output;
    }
}
