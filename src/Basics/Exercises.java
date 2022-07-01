package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //1
        System.out.println("Hello");
        System.out.println("Maria Pahome");

        //2
        int a = 74;
        int b = 36;
        int result = a + b;
        System.out.println(result);

        //3
        int c = 50;
        int d = 3;
        int divided = c / d;
        System.out.println(divided);

        //4
        List<Integer> operations = new ArrayList<Integer>();
        int e = -5 + 8 * 6;
        int f = (55 + 9) % 9;
        int g = 20 + -3 * 5 / 8;
        int i = 5 + 15 / 3 * 2 - 8 % 3;
        operations.add(e);
        operations.add(f);
        operations.add(g);
        operations.add(i);
        for (Integer x : operations) {
            System.out.println(x);
        }

        //5
        Scanner s = new Scanner(System.in);
//        System.out.println("Input first number: ");
//        int first = s.nextInt();
//        System.out.println("Input first number: ");
//        int second = s.nextInt();
//        int multiplied = first * second;
//        System.out.println(first + " x " + second + " = " + multiplied);

        //6
//        System.out.println("Input first number: ");
//        int x = s.nextInt();
//        System.out.println("Input first number: ");
//        int y = s.nextInt();
//        System.out.println(x + " + " + y + " = " + (x+y));
//        System.out.println(x + " - " + y + " = " + (x-y));
//        System.out.println(x + " * " + y + " = " + x*y);
//        System.out.println(x + " / " + y + " = " + x/y);
//        System.out.println(x + " mod " + y + " = " + x%y);

        //7
//        System.out.println("Input a number: ");
//        int z = s.nextInt();
//        for(int w=0; w<=10; w++){
//            System.out.println(z + " x " + w + " = " + z*w);
//        }

        //8
        System.out.println(" " + " " + "J" + " " + " " + " " + "a" + " " + " " + " " + "V" + " " + " " + " " + " " + " " + "V" + " " + " " + " " + "a" + " " + " ");
        System.out.println(" " + " " + "J" + " " + " " + "a" + " " + "a" + " " + " " + " " + "V" + " " + " " + " " + "V" + " " + " " + " " + "a" + " " + "a" + " " + " ");
        System.out.println("J" + " " + "J" + " " + "a" + "a" + "a" + "a" + "a" + " " + " " + " " + "V" + " " + "V" + " " + " " + " " + "a" + "a" + "a" + "a" + "a" + " ");
        System.out.println("J" + "J" + " " + "a" + " " + " " + " " + " " + " " + "a" + " " + " " + " " + "V" + " " + " " + " " + "a" + " " + " " + " " + " " + "" + " " + "a");

        //9
        double ex = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(ex);

        //10
        double ex2 = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(ex2);

        //11
        final double radius = 7.5;
        double PI = Math.PI;
        double perimeter = 2 * radius * PI;
        double area = PI * (radius * radius);
        System.out.println("Radius = " + radius);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        //12
//        System.out.println("Input three numbers: ");
//        double nr1, nr2, nr3;
//        nr1 = s.nextDouble();
//        nr2 = s.nextDouble();
//        nr3 = s.nextDouble();
//        double res = (nr1 + nr2 + nr3)/3;
//        System.out.println("Average = " +  res);

        //13
        double width = 5.5;
        double height = 8.5;
        double area2 = width * height;
        double perimeter2 = 2 * (width + height);
        System.out.println("Area is " + width + " * " + height + " = " + area2);
        System.out.println("Perimeter is " + "2" + "*" + "(" + width + " + " + height + ")"+ "=" + perimeter2);

        //14
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");

        //15

    }
}
