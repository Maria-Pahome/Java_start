package StringExercises;

//to compare a given string to the specified character sequence
public class Exercise9 {
    public static void main(String[] args) {
        String str1 = "example.com";
        String str2 = "Example.com";

        boolean value1 = str1.contentEquals(str1);
        System.out.println("Comparing " + str1 +  " and " + str1 + ": " + value1);

        boolean value2 = str1.contentEquals(str2);
        System.out.println("Comparing " + str2 + " and " + str1 + ": " + value2);
    }
}
