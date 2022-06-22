package StringExercises;

//program to compare two strings lexicographically.
// Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

public class Exercise5 {
    public static void main(String[] args) {
        String string1 = "This is Exercise 4";
        String string2 = "This is Exercise 1";
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        int comparison = (string1).compareTo(string2);

        if (comparison < 0) {
            System.out.println(string1 + " is less than " + string2);
        } else if (comparison == 0){
            System.out.println(string1 + " is equal to " + string2);
        } else{
            System.out.println(string1 + " greater than " + string2);
        }

    }
}

