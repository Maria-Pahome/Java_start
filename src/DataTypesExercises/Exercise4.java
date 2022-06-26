package DataTypesExercises;

import java.util.Scanner;

// to convert minutes into a number of years and days
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double minutesInYear = 60 * 24 * 365;
        System.out.println("Input the number of minutes: ");
        double minutes = input.nextDouble();

        long years = (long) (minutes / minutesInYear);
        int days = (int)(minutes /60/24) % 365;
        System.out.println("Years from total minutes: " + years);
        System.out.println("Days from total minutes: " + days);
        System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
