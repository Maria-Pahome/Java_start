package StringExercises;

//to get the contents of a given string as a character array -> getChars()
public class Exercise16 {
    public static void main(String[] args) {
       String str = "This is a random String.";
       char [] array = new char[] {' ', ' ', ' ', ' ', ' '};
       str.getChars(5, 8, array, 0);
        System.out.println("The char array equals to " + array);
    }
}
