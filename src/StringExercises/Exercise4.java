package StringExercises;

// a program to count a number of Unicode code points in the specified text range of a String

public class Exercise4 {
    public static void main(String[] args) {
        String newString = "w3resource.com";
        System.out.println("Original String : " + newString);

        int countCodes = newString.codePointCount(1, 9);
        System.out.println("Codepoint count = " + countCodes);
    }
}
