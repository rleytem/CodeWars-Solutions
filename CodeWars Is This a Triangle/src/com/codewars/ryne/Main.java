package com.codewars.ryne;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {

//        Implement a function that accepts 3 integer values a, b, c. The function should return true
//        if a triangle can be built with the sides of given length and false in any other case.
//
//        (In this case, all triangles must have surface greater than 0 to be accepted).

        // Heron's formula:
        //1) calculate s (half of triangles perimeter
        //s = (a+b+c)/2
        //
        //2) calculate area:
        //A = Sqrt( s * (s-a) * (s-b) * (s-c) )
        //source: https://www.mathsisfun.com/geometry/herons-formula.html

        System.out.println(isTriangle(1,2,2));



    }

    public static boolean isTriangle(int a, int b, int c){
        //we need to use Heron's formula to take the three sides passed through as parameters and find the area
        //using the formula we find half of the triangles perimeter and use that to calculate the area
        //we know that negative parameters will not work so that will always return false
        //if any of the sides are bigger than the other two combined, we will always return false
        //no triangles side can ever be bigger than the other two combined
        //truthfully, per the challenges request, we do not need to do heron's formula
        //we could just check the sides.
        //because dividing the sides can result in decimal numbers we need to typecast them to double.
        //by doing that in the halfPerimeter s part of the expression, the area can be calculated normally
        //if we can make a triangle with the three sides passed, return true

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a > (b + c) || b > (a + c) || c > (a + b)) {
            return false;
        }

        double s = ((double) a + (double) b + (double) c)/2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

//        System.out.printf("A: %d B: %d C: %d   s: %f A: %f%n",a,b,c,s,area);
        if (area <= 0) {
            return false;
        }

        return true;
    }
}
