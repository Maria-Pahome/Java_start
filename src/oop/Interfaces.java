package oop;

interface Animal3{
    public void animalSound3();
    public void sleep3();
}

class Pig3 implements Animal3 {
    public void animalSound3() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep3() {
        System.out.println("Zzzzzz");
    }
}

interface FirstInterface{
    public void myMethod();
}

interface SecondInterface{
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod(){
        System.out.println("Some text...");
    }
    public void myOtherMethod(){
        System.out.println("Some other test....");
    }
}



