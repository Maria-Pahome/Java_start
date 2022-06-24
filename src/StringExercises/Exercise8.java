package StringExercises;

//to test if a given string contains the specified sequence of char values
public class Exercise8 {
    public static void main(String[] args) {
        String originalString = "PHP Exercises and Python Exercises ";
        String charValues = "and";
        System.out.println("Original String: " + originalString);
        System.out.println("Specified sequence of char values: " + charValues);
        System.out.println(originalString.contains(charValues));
    }
}
