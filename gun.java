package com.frasier;

import java.sql.SQLOutput;
import java.util.Scanner;

public class gun {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter value of a ");
//        int a=input.nextInt();
//        System.out.print("Enter value of b ");
//        int b= input.nextInt();
//        System.out.println("Sum of a and b is "+ (a+b));
//        int i;
//        for(i=1; i<=10; i++){
//              System.out.print(i);
//          }
            Scanner input = new Scanner(System.in);
//            System.out.print("Enter your button number: ");
//            int button =input.nextInt();
//            System.out.print("Enter Your age: ");
//            int age = input.nextInt();
//            if (age<18) {
//                System.out.println("YOu are a kid");
//            }
//            else if (age==18){
//                System.out.println("You will be granted a kid pass");
//            }
//            else {
//                System.out.println("You are an adult");
//            }

//              switch (button){
//                  case 1:
//                      System.out.println("Hello World");
//                      break;
//                  case 2:
//                      System.out.println("Bonjour");
//                      break;
//                  case 3:
//                      System.out.println("Konichiwa");
//                      break;
//              }
            int a= input.nextInt();
            int b= input.nextInt();
            int c= input.nextInt();
            int max = a;
            if(b>max) {
                max = b;
            }
            if(c > max){
                max=c;
            }
            System.out.println("Larger number is "+ max);



    }
}
