package oop;

// nested classes

class OuterClass {
    int x = 10;

    class InnerClass {  // private -> error: oop.OuterClass.InnerClass has private access in oop.OuterClass
        int y = 5;
        public int myInnerMethod(){
            return x;
        }
    }  //an inner class can be private or protected

    static class InnerClass2 {   // a static inner class does not have access to members of the outer class.
        int y = 6;
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.InnerClass2 myInner2 = new OuterClass.InnerClass2();

        System.out.println(myInner.y + myOuter.x);
        System.out.println(myInner2.y);
        System.out.println(myInner.myInnerMethod());

    }
}

