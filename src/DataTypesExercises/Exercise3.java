package DataTypesExercises;

import java.util.Scanner;

import static java.lang.Math.random;

// program that reads an integer between 0 and 1000 and adds all the digits in the integer
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        int firstDigit = (num % 10);
        System.out.println(firstDigit);
        int remainingNumber = num / 10;
        System.out.println(remainingNumber);
        int secondDigit = remainingNumber % 10;
        System.out.println(secondDigit);
        remainingNumber = remainingNumber / 10;
        System.out.println(remainingNumber);
        int thirdDigit = remainingNumber % 10;
        System.out.println(thirdDigit);
        remainingNumber = remainingNumber / 10;
        System.out.println(remainingNumber);
        int fourthDigit = remainingNumber % 10;
        System.out.println(fourthDigit);
        remainingNumber = remainingNumber / 10;
        System.out.println(remainingNumber);
        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println(sum);
        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}
