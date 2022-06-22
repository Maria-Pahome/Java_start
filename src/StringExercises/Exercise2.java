package StringExercises;

// a program to get the character (Unicode code point) at the given index within the String  -> codePointAt

public class Exercise2 {
    public static void main(String[] args) {
        String newString = "w3resource.com";
        System.out.println("Original String : " + newString);

        int firstValue = newString.codePointAt(2);
        int secondValue = newString.codePointAt(3);

        System.out.println("Character(unicode point) = " + firstValue);
        System.out.println("Character(unicode point) = " + secondValue);
    }
}
