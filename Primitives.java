package com.frasier;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int rollno = input.nextInt();
//        System.out.println("Your Roll number is "+ rollno);
          int i;
          int n=5;
          for(i=1;i<=5;i++){
              for(int j=1;j<=n-i+1;j++) {
                  System.out.print("* ");
              }
              System.out.println();
          }

          }
    }

