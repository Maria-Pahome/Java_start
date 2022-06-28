import jdk.swing.interop.SwingInterOpUtils;

public class Enums {
    enum Level {
        LOW, MEDIUM,HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.LOW;
        System.out.println(myVar);

        switch (myVar){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }

//        for(Level myVar :Level.values()){
//            System.out.println(myVar);
//        }
    }



}
