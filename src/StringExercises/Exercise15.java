package StringExercises;

// to get the contents of a given string as a byte array -> getBytes()
public class Exercise15 {
    public static void main(String[] args)  {
        String str1 = "This is a sample String.";
        byte[] bytesArray = str1.getBytes();

        String newString = new String(bytesArray);
        System.out.println("The new String " + "equals " +  newString + ".");

    }
}
