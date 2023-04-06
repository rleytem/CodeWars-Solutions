package com.codewars.ryne;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        Write a function that takes a string of braces, and determines if the order of the braces is valid.
//        It should return true if the string is valid, and false if it's invalid.
//
//        This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [],
//        and curly braces {}. Thanks to @arnedag for the idea!
//
//        All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
//
//        What is considered Valid?
//        A string of braces is considered valid if all braces are matched with the correct brace.
//        Examples
//
//        "(){}[]"   =>  True
//        "([{}])"   =>  True
//        "(}"       =>  False
//        "[(])"     =>  False
//        "[({})](]" =>  False

        System.out.println(isValid("()"));
//        System.out.println(isValid("([{}])"));
//        System.out.println(isValid("(}"));
//        System.out.println(isValid("[(])"));
//        System.out.println(isValid("[({})](]"));
//        System.out.println(isValid("()"));
//        System.out.println(isValid("[(])"));


    }

    public static boolean isValid(String braces) {

        //create an empty stack object named brace
        //for loop that goes through length of string
        //check to see if we have a left brace, a valid set of braces will always start with a left one
        //if it is, we add it to the stack (push)
        //if it isnt a left brace then we assume its a right brace
        //but first we check to make sure the stack isnt empty, if it is, and the current one is a right brace
        //it cant be a valid set
        //then we compare the current index with whatever the top one of the stack is
        //and if it's not a matching brace at all, then we know it cant be a valid brace set and return false
        //otherwise we remove it (pop it) from the stack
        //final check to see if the stack isnt empty, meaning we got leftovers, that means invalid braces set
        //if we get to the end with no issues, return true,
        //inspired by some StackOverflow code. gave me some more exposure to stacks and stack manipulation

        Stack<Character> brace = new Stack<>();

        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '(' || braces.charAt(i) == '{' || braces.charAt(i) == '[') {
                brace.push(braces.charAt(i));
            } else {
                if (brace.isEmpty() == true) {
                    return false;
                }
                if ((braces.charAt(i) == ')' && brace.peek() != '(') || (braces.charAt(i) == '}'
                        && brace.peek() != '{') || (braces.charAt(i) == ']' && brace.peek() != '[')) {
                    return false;
                } else {
                    brace.pop();
                }
            }
        }
        if (brace.isEmpty() == false) {
            return false;
        }
        return true;
    }
}
