package Collections;

import java.util.*;

public class HashSets {
    public static void main(String[] args) {
       // to append the specified element to the end of a hash set
        HashSet<Integer> even = new HashSet<Integer>();
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        even.add(10);
        even.add(12);
        even.add(14);
        System.out.println(even);

        even.add(16);
        System.out.println(even);

        // to iterate through all elements in a hash list
        for(Integer x:even){
            System.out.println(x);
        }
        Iterator<Integer> evenNumbers = even.iterator();
        while(evenNumbers.hasNext()){
            System.out.println("Hashset nr: " + evenNumbers.next());
        }

        // to get the number of elements in a hash set
        System.out.println("Size hashset: " + even.size());

        // to empty a hash set
        even.clear();
        System.out.println("Empty hashset: " + even);

        // to test a hash set is empty or not
        System.out.println(even.isEmpty());

        // to clone a hash set to another hash set
        even.add(20);
        even.add(40);
        even.add(60);
        even.add(80);
        even.add(100);
        System.out.println("Original hashset: " + even);
        HashSet<Integer> evenCloned = new HashSet<Integer>();
        evenCloned = (HashSet)even.clone();
        System.out.println("Cloned hashset: " + evenCloned);

        // to convert a hash set to an array
        Integer [] evenArray = new Integer[even.size()];
        even.toArray(evenArray);
        System.out.println("This should be an array: ");
        for(Integer x: evenArray){
            System.out.println(x);
        }

        // to convert a hash set to a tree set
        TreeSet<Integer> evenTreeSet = new TreeSet<Integer>(even);
        System.out.println("TreeSet: " + evenTreeSet);
        for(Integer x:evenTreeSet){
            System.out.println("Element in TreeSet: " + x);
        }

         // to convert a hash set to a List/ArrayList
        List<Integer> evenList = new ArrayList<>(even);
        System.out.println("ArrayList: " + evenList);

        // to compare two hash set
        HashSet<Integer> odd = new HashSet<Integer>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        System.out.println("This is an odd hashset: " + odd);
        HashSet<Integer> comparedHashSet = new HashSet<Integer>();
    }
}
