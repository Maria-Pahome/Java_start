package StringExercises;

import java.util.Calendar;

// to print current date and time in the specified format. -> format()
public class Exercise14 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time:");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
