package StringExercises;
//a program to get the character at the given index within the String

public class Exercise1 {
    public static void main(String[] args) {
        String newString = "Java Exercises!";
        System.out.println("Original String = " + newString);

        int index1 = newString.charAt(0);
        int index2 = newString.charAt(10);

        System.out.println("Position 0 : " + (char)index1);
        System.out.println("Position 10 : " + (char)index2);
    }
}
