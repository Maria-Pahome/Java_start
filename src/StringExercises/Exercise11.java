package StringExercises;

//o check whether a given string ends with the contents of another string. -> endsWith()

public class Exercise11 {
    public static void main(String[] args) {
        String string1 = "Python Exercises";
        String string2 = "Python Exercise";
        String string3 = "se";
        boolean value1 = (string1).endsWith(string3);
        System.out.println(string1 + " ends with " + string3 + "? " + value1);

        boolean value2 = (string2).endsWith(string3);
        System.out.println(string2 + " ends with " + string3 + "? " + value2);
    }
}
