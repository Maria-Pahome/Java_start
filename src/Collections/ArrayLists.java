package Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// to create a new array list, add some colors (string) and print out the collection
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("yellow");
        colors.add("white");
        colors.add("black");
        colors.add("orange");
        colors.add("purple");
        System.out.println(colors);

        // another array list
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("0");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        System.out.println(numbers);


        // to iterate through all elements in an array list
        for(String i:colors){
            System.out.println(i);
        }

        // to insert an element into the array list at the first position
        colors.add(0, "bright yellow");
        System.out.println(colors);

        // to retrieve an element (at a specified index) from a given array list
        System.out.println(colors.get(0));

        // to update specific array element by given element
        colors.set(3, "darker color");
        System.out.println(colors);

        // to remove the third element from an array list
        colors.remove(3);
        System.out.println(colors);

        // to search an element in an array list -> contains()
        if (colors.contains("yellow")){
            System.out.println("Found the element");
        } else{
            System.out.println("No such element");
        }

        // to sort a given array list
        Collections.sort(colors);
        for(String i: colors){
            System.out.println(i);
        }

        // to reverse elements in an array list
        Collections.reverse(numbers);
        System.out.println(numbers);

        // to shuffle elements in an array list - amesteca
        Collections.shuffle(numbers);
        System.out.println(numbers);

        // to extract a portion of an array list
         List<String> sublist = numbers.subList(0,2);
        System.out.println(sublist);

        // to compare two array lists
        boolean compare = colors.equals(numbers);
        System.out.println(compare);

        // swap two elements in an array list
        System.out.println("Before swiping: " + colors);
        Collections.swap(colors, 3,4);
        System.out.println("Before swiping: " + numbers);
        Collections.swap(numbers, 1,2);
        System.out.println("After swiping: " + colors);
        System.out.println("After swiping: " + numbers);

        // to join two array lists
        ArrayList<String> added = new ArrayList<String>();
        added.addAll(colors);
        added.addAll(numbers);
        System.out.println(added);

        //  to clone an array list to another array list
        ArrayList cloned = (ArrayList)colors.clone();
        System.out.println(cloned);
        ArrayList<String> clonedNumbers = (ArrayList<String>)numbers.clone();
        clonedNumbers.add("54");
        System.out.println(clonedNumbers);

        // to empty an array list
        cloned.clear();
        System.out.println("Empty array: " + cloned);

        // to test an array list is empty or not
        System.out.println(cloned.isEmpty());

        // to trim the capacity of an array list the current list size
        colors.trimToSize();

        //to increase the size of an array list
        try{
            System.out.println("Original array: " + colors);
            System.out.println("Increasing the capacity of ArrayList numbers to store up to 10 colors");
//            colors.ensureCapacity(10);
            System.out.println(
                    "ArrayList numbers can now store up to 10 elements.");
        } catch(NullPointerException e){
            System.out.println("Exception thrown :" + e);
        }
    }
}

