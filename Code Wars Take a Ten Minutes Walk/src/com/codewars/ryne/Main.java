package com.codewars.ryne;

public class Main {
//    You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes
//    too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides
//    its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an
//    array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only
//    a single block for each letter (direction) and you know it takes you one minute to traverse one city block,
//    so create a function that will return true if the walk the app gives you will take you exactly ten minutes
//    (you don't want to be early or late!) and will, of course, return you to your starting point.
//    Return false otherwise.
//
//    Note: you will always receive a valid array containing a random assortment of direction letters
//    ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
    public static void main(String[] args) {

        char[] test1 = new char[] {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
        char[] test2 = new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'};
        char[] test3 = new char[] {'w'};
        char[] test4 = new char[] {'n','n','n','s','n','s','n','s','n','s'};

        System.out.println(isValid(test1));
        System.out.println(isValid(test2));
        System.out.println(isValid(test3));
        System.out.println(isValid(test4));
    }

    public static boolean isValid(char[] walk) {

        //set up three local variables
        //count to keep track of blocks walked
        //x and y to keep track of how far we are from the starting position
        //per the goal, we want to kill time for 10 minutes, but we want to make sure we're back at our starting area on time
        //
        //imagining the grid x and y, if we move north, y increments, south, y decrements
        //east, x increments, west, y increments
        //
        //for loop goes the length of the walk, so we go the entire the length of the walk
        //check each iteration if we go north, south, east and west and mark that on the grid.
        //
        //the final goal needs to be a count of 10 (10 blocks walked), and X and Y both 0. meaning we are back to the starting area

        int count = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < walk.length; i++) {
            count++;
            if (walk[i] == 'n') {
                y++;
            } else if (walk[i] == 's') {
                y--;
            }

            if (walk[i] == 'e') {
                x++;
            } else if (walk[i] == 'w') {
                x--;
            }
        }

        if (!(count == 10) || ((x != 0) || (y != 0))) {
            return false;
        }

        return true;
    }
}
