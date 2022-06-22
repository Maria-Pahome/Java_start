package StringExercises;

//a program to get the character (Unicode code point) before the specified index within the String. -> codePointBefore()

public class Exercise3 {
    public static void main(String[] args) {
        String newString = "w3resource.com  ";
        System.out.println("Original String :" + newString);

        int firstValue = newString.codePointBefore(3);
        int secondValue = newString.codePointBefore(2);

        System.out.println("Character(unicode point) = " + firstValue);
        System.out.println("Character(unicode point) = " + secondValue);
    }
}
