package com.frasier;

import java.util.Scanner;

public class Functions {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String naam = input.nextLine();
//        String personalized = myGreet(naam);
//        System.out.println(personalized);
//
//    }
//
//    static String myGreet(String name) {
//        String message = "hello "+ name;
//        return message;
//
//    }
    public static void main(String[] args) {
        int a =10;
        int b= 20;
        swap(a,b);


}
    static void swap(int a, int b){
        int temp =a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }

}

