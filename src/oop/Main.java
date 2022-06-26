package oop;

public class Main {
    int x = 5;
    final int y = 2 * 3; // final = modifier

    static void myMethod() {
        System.out.println("Hello World!");
    }

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        Main myObject1 = new Main();  //new instance of Main -> obj1
        Main myObject2 = new Main();  //new instance of Main -> obj2
        System.out.println(myObject1.x);
        System.out.println(myObject2.y);

        myObject1.x = 40; // override
        System.out.println(myObject1.x);
        //myObject2.y = myObject1.x * 23; //error: cannot assign a value to final variable y
        System.out.println(myObject2.y);

        myMethod(); // method called


        myStaticMethod();
        //myPublicMethod(); //error: non-static method myPublicMethod() cannot be referenced from a static context
        Main newObject = new Main(); //created new Main obj + called the public method
        newObject.myPublicMethod();

        // encapsulated object
        Person objectX = new Person();
        // objectX.setName("John") = "John"; // error: name has private access in oop.Person
        // System.out.println(objectX.name);
        // getName() and setName() methods to access and update the variable
        objectX.setName("John");
        System.out.println("Getting the setter attribute: " + objectX.getName());


        // polymorphism
        System.out.println("POLYMORPHISM:");
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();


        //abstraction
        System.out.println("ABSTRACTION:");
        Pig2 myPig2 = new Pig2();
        myPig2.animalSound2();
        myPig2.sleep();
    }
}
