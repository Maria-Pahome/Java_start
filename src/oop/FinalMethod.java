package oop;

public class FinalMethod {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        FinalMethod myObj = new FinalMethod();
        // myObj.x = 50; //cannot assign a value to final variable
        // myObj.PI = 25;
        System.out.println(myObj.x);
    }
}
