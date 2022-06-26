package DataTypesExercises;

//to convert temperature from Fahrenheit to Celsius degree
public class Exercise1 {
    public static void main(String[] args) {
        double fahrenheit = 212;
        double result = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Input a degree in Fahrenheit: " + fahrenheit);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + result + " in Celsius");
    }
}
