package Collections;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

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
        LinkedList<String> numbers = new LinkedList<String>();
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
        LinkedList<String> alphabet = new LinkedList<String>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");

        alphabet.addAll(professions);
        System.out.println(alphabet);

    }
}
