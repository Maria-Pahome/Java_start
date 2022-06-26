package oop;

// get & set -> Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case
public class Person {
    public String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

}

// private = restricted access
