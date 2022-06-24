package StringExercises;

//to create a new String object with the contents of a character array. -> copyValueOf()
public class Exercise10 {
    public static void main(String[] args) {
        char [] arrayNumbers = new char[] {'1', '2', '3', '4'};
        String newString = String.copyValueOf(arrayNumbers, 1,3);   //index 1 to 3

        System.out.println("The book contains " + newString + " pages.");
    }
}
