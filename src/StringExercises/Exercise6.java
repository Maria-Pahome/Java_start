package StringExercises;

public class Exercise6 {
    public static void main(String[] args) {
        String string1 = "This is exercise 1";
        String string2 = "This is Exercise 1";
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        int comparison = (string1).compareToIgnoreCase(string2);

         if (comparison < 0){
             System.out.println(string1 + " is less than " + string2);
         }else if(comparison == 0){
             System.out.println(string1 + " is equal to " + string2);
        } else {
             System.out.println(string1 + " greater than " + string2);
         }
    }
}
