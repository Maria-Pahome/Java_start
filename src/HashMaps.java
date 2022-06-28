import java.util.HashMap;


public class HashMaps {
    //hashmap with the same data types
    // dictionary in Python
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England","London");  // add items -> put()
        capitalCities.put("Romania","Bucharest");
        capitalCities.put("France","Paris");
        capitalCities.put("China","Beijing");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Romania")); // access a value -> get()
        capitalCities.remove("Romania");
        System.out.println(capitalCities);
        // capitalCities.clear();
        // System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        for(String i:capitalCities.keySet()){ // takes the keys
            System.out.println(i);
        }
        for(String i:capitalCities.values()){  // takes the values of the keys
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // HashMap with different data type
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("George",23);
        people.put("Matei",34);
        people.put("Viorel",45);
        people.put("Titel",13);
        System.out.println(people);
        for(String i: people.keySet()){
            System.out.println("key: " + i + " ; " + " value: " + people.get(i));
        }
    }
}
