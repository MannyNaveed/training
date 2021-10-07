package com.vbms.testproj.JavaClass2;

public class Sapnumbers {
    public static void main(String[] args)
    {

        int x = 5, y = 25;
        System.out.println("Before sawap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        //x=5;y=25;
       x=x+y;
       //x=30;y=25;
       y=x-y;
       //y=5;x=30;
       x=x-y;
       //x=25;y=5

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
