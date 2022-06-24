package StringExercises;
//to concatenate a given string to the end of another string
public class Exercise7 {
    public static void main(String[] args) {
        String string1 = "PHP Exercises and";
        String string2 = " Python Exercises";
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        String concatenated = (string1).concat(string2);
        System.out.println("The concatenated string: " + concatenated);
    }
}
