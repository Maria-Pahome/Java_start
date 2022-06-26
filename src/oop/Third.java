package oop;

public class Third{
    String fname = "John";
    String lname = "Doe";
    int age = 24;


    public static void main(String[] args) {
        Third myObj = new Third();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

        Car newObj = new Car();
        System.out.println("Object of the Car class called in Third class: ");
        newObj.fullThrottle();
        newObj.speed(400);
    }

}

