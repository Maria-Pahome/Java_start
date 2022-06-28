import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        // ArrayList
        java.util.ArrayList<String> cars = new java.util.ArrayList<String>();   // object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0, "Opel");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        // cars.clear();
        System.out.println(cars);
        System.out.println(cars);
        cars.size();
        for (int i = 0; i < cars.size(); i++) {   // for loop
            System.out.println(cars.get(i));
        }
        for (String i:cars){       // for-each loop
            System.out.println(i);
        }

        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<Integer>();  // object
        numbers.add(10);
        numbers.add(16);
        numbers.add(20);
        numbers.add(34);
        numbers.add(2);
        numbers.add(21);
        numbers.add(9);
        for(int i: numbers){
            System.out.println(i);
        }

        java.util.ArrayList<Boolean> booleans = new java.util.ArrayList<Boolean>(); // object
        booleans.add(true);
        booleans.add(false);
        System.out.println(booleans);

        // sort an array - alphabetically or numerically - Collection package
        Collections.sort(cars);
        for(String i:cars){
            System.out.println(i);
        }
        Collections.sort(numbers);
        for(int i:numbers){
            System.out.println(i);
        }

    }
}
