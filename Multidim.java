package com.frasier;

import java.util.Arrays;
import java.util.Scanner;

public class Multidim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr=new int[3][2];

        for(int row=0;row<arr.length;row++){
            for (int col=0; col<arr[row].length;col++){
                arr[row][col]=input.nextInt();
            }
        }

        for (int row=0; row<arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }


//        int[][] arr= {
//                {2,3,5},
//                {4,6,7},
//                {8,9,11}
//        };
//        System.out.println(arr);

//
//            for (int col=0; col<arr[row].length; col++){
//                arr[row][col]=input.nextInt();
//
//            }//        for (int row=0; row<arr.length; row++){
//
//            for (int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col]+" ");
//
//            }
//            System.out.println();
//        }
    }
}
