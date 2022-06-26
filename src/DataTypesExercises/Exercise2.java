package DataTypesExercises;

import java.util.Scanner;

import static java.lang.Math.floor;

// program that reads a number in inches, converts it to meters.
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a value for inch: ");

        double inches = input.nextDouble();
        double meters = floor((inches * 0.0254));
        System.out.println(inches + " inch is " + meters + " meters");
    }
}
