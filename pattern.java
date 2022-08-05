package com.frasier;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        //inverted half pyramid rotated by 180 degree
//   *
//  **
// ***
//****
        /*
        int n=4;
        for (int row =1; row <=n; row++) {
            for (int col=1; col<=n-row; col++) {
                System.out.print(" ");
            }
            for (int i =1; i<=row ; i++) {
                System.out.print("*");

            }
            System.out.println();

        }
        */

        //inverted half pyramid
        /*
        int num=4;
        for (int row = 4; row>=1 ; row--) {
            for (int col =1; col <=row ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
        */


//        hollow rectange
        /*
        int r=4;
        int c=5;

        for (int row = 1; row <=r; row++) {
            for (int col =1; col <=c; col++) {
                if(row==1 || col==1 || row==r ||col==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();

        }*/

        //half pyramid
        /*
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int row = 0; row <=num; row++) {
            for (int col = 0; col <row ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
        */
    }
}
