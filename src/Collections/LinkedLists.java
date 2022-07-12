package Collections;
import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        //to append the specified element to the end of a linked list
        LinkedList<String> professions = new LinkedList<String>();
        professions.add("architect");
        professions.add("doctor");
        professions.add("teacher");
        professions.add("electrician");
        professions.add("engineer");
        professions.add("butcher");
        professions.add("designer");
        professions.add("artist");

        professions.addLast("singer");
        System.out.println(professions);

        // to iterate through all elements in a linked list
        for (String i : professions) {
            System.out.println(i);
        }

        // to iterate through all elements in a linked list starting at the specified position
        Iterator nr = professions.listIterator(2);
        while (nr.hasNext()) {
            System.out.println(nr.next());
        }

        // to iterate a linked list in reverse order
        Iterator reversed = professions.descendingIterator();
        while (reversed.hasNext()) {
            System.out.println("Reversed:" + reversed.next());
        }

        // to insert the specified element at the specified position in the linked list
        professions.set(3, "VideoEditor");
        System.out.println(professions);

        // to insert elements into the linked list at the first and last position
        professions.addFirst("Country Songwriter");
        professions.addLast("Jazz Songwriter");
        System.out.println(professions);

        // to insert the specified element at the front of a linked list.
        professions.offerFirst("pop-house artist");
        System.out.println(professions);

        // to insert the specified element at the end of a linked list
        professions.offerLast("JAZZ artist");
        System.out.println(professions);

        // to insert some elements at the specified position into a linked list
        LinkedList<String> numbers = new LinkedList<>();
        numbers.add("23");
        numbers.add("24");
        numbers.add("25");

        professions.addAll(2, numbers);
        System.out.println(professions);


        //  to get the first and last occurrence of the specified elements in a linked list
        System.out.println("First: " + numbers.getFirst());
        System.out.println("Last: " + numbers.getLast());

        // to display the elements and their positions in a linked list
        for(int i = 0; i < professions.size(); i++){
            System.out.println(i + " " + professions.get(i));
        }

        //  to remove a specified element from a linked list
        numbers.remove(1);
        System.out.println(numbers);

        // to remove first and last element from a linked list
        professions.removeFirst();
        professions.removeLast();
        System.out.println(professions);

        // to remove all the elements from a linked list
        System.out.println("Original linkedlist: " + numbers);
        numbers.clear();
        System.out.println("This list is empty: " + numbers);

        // swap two elements in a linked list
        System.out.println("List before swapping: " + professions);
        Collections.swap(professions, 7, 9);
        System.out.println("List after swapping: " + professions);

        // to shuffle the elements in a linked list
        Collections.shuffle(professions);
        System.out.println("After shuffling: " + professions);

        // to join two linked lists
        LinkedList<String> alphabet = new LinkedList<>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");

        alphabet.addAll(professions);
        System.out.println(alphabet);

        // to remove and return the first element of a linked list
        System.out.println("Before: " + professions);
        professions.pop();
        System.out.println("After: " + professions);

        // to retrieve but does not remove, the first element of a linked list
        System.out.println("Retrieving first element: " + professions);
        System.out.println("Retrieving: " + professions.peekFirst());

        // to retrieve but does not remove, the last element of a linked list
        System.out.println("Retrieving last element: " + professions);
        System.out.println("Retrieving the last : " + professions.peekLast());

        //  to check if a particular element exists in a linked list
        System.out.println(professions.contains("shopper"));

        // to convert a linked list to array list
        numbers.add("20");
        numbers.add("21");
        numbers.add("22");
        numbers.add("23");
        System.out.println("LinkedList: " + numbers);
        List<String> arrayList = new ArrayList<>(numbers);
        for(Object i:arrayList){
            System.out.println("String in array list: " + i);
        }
        System.out.println("ArrayList: " + arrayList);

        // to compare two linked lists
        boolean compare = professions.equals(numbers);
        System.out.println(compare);

        LinkedList<String> compared = new LinkedList<>();
        for(String x: professions){
            compared.add(numbers.contains(x) ? "Yes!" : "No!");
        }
        System.out.println(compared);
        compared.clear();

        // to test a linked list is empty or not
        System.out.println(numbers.isEmpty());
        System.out.println(professions.isEmpty());
        System.out.println(compared.isEmpty());

        // to replace an element in a linked list
        numbers.set(0, "19");
        System.out.println(numbers);
    }
}
