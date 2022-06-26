package oop;

public class Constructor {
    int x;
    int modelYear;
    String modelName;

    public Constructor(int y, int year, String name) {  // cannot be void, only public
        x = y;
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(5, 1978, "Mustang");
        System.out.println(myObj.x);
        System.out.println(myObj.modelYear + " " + myObj.modelName);
    }

}
