package com.vbms.testproj.java20092021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestSimulator {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Naveed","Ratan","John","Aron");

        System.out.println("Whats your name?");
        Scanner sc = new Scanner(System.in);
             String name =sc.next();

       if (employees.contains(name)) {
           System.out.println(name +" works  in BAH");
       }else{
           System.out.println("Not a right person");
       }
    }
}
