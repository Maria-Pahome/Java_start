package StringExercises;

// to compare a given string to another string, ignoring case considerations -> equalsIgnoreCase()
public class Exercise13 {
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "stephen edwin king";

        boolean val1 = (str1).equalsIgnoreCase(str2);
        boolean val2 = (str1).equalsIgnoreCase(str3);

        System.out.println(str1 + " equals " + str2 + " ? " + val1);
        System.out.println(str1 + " equals " + str3 + " ? " + val2);
    }
}
