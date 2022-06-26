package oop;
//To access an abstract class, it must be inherited from another class

// abstract class
//abstract class Abstract {
//    public String first_name = "John";
//    public String last_name = "Doe";
//    public String email = "john@doe.com";
//    public int ages = 24;
//    public abstract void study(); // abstract method
//}

// Subclass (inherit from Person)
class Student extends Main {
    public int graduationYear = 2018;

    public void study() {
        System.out.println("Studying all day long");
    }
}

