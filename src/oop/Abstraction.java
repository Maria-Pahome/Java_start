package oop;

abstract class Animal2{
    public void animalSound2(){ //abstract methods cannot have a body
        System.out.println("The animal makes a sound");
    }
    public void sleep(){
        System.out.println("Zzzz");
    }
}

class Pig2 extends Animal2{
    public void animalSound2(){
        System.out.println("The pig says: we we");
    }
}

class Dog2 extends Animal2{
    public void animalSound2(){
        System.out.println("The dog says: bow wow");
    }
}