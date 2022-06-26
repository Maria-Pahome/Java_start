package DataTypesExercises;

import java.util.Scanner;

// program to compute body mass index
// BMI = (weight in pounds x 703) / (height in inches x height in inches).
// BMI = kg/m2 (Europe)
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println("Input height in inches: ");
        double inches = input.nextDouble();
        double bodyMassIndex = (pounds * 703) / (inches * inches);
        System.out.println("Body Mass Index is " + bodyMassIndex + " pounds/inches2");


        System.out.println("Input weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Input height in meters: ");
        double height = input.nextDouble();
        double squareHeight = height*height;
        double BMI = weight/squareHeight;
        System.out.println("Body Mass Index is: " + BMI + " kg/m2");
        if (BMI < 16){
            System.out.println("Severe Thinness");
        } else if (BMI>=16 && BMI<17){
            System.out.println("Moderate Thinness");
        } else if (BMI>=17 && BMI<18.5){
            System.out.println("Mild Thinness");
        } else if (BMI>=18.5 && BMI<25){
            System.out.println("Normal");
        } else if (BMI>=25 && BMI<30) {
            System.out.println("Overweight");
        }else if (BMI>=30 && BMI<35) {
            System.out.println("Obese Class I");
        } else if (BMI>=35 && BMI<40) {
            System.out.println("Obese Class II");
        } else if (BMI>40) {
            System.out.println("Obese Class III");
        } else {
            System.out.println("Finish");
        }
    }
}
