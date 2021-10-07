package com.vbms.testproj.naveed;

public class CalculatorService {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int result =calculator.add(20,46);
        System.out.println("Add Result="+result);
        int subResult=calculator.subtract(60,30);
        System.out.println("subtract Result="+subResult);

    }

}
