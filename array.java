package com.frasier;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0]=24;
        arr[1]=424;
        arr[2]=65;
        arr[3]=74;
        arr[4]=288;
//        System.out.println(arr[3]);
//
//        for(int i=1;i<arr.length;i++){
//            arr[i] = input.nextInt();
//
//        }
//        for(int i=1;i<arr.length;i++) {
//            System.out.print(arr[i] + " ");
//
//
//        }
//          String[] str = new String[4];
//          for (int i=1;i<str.length; i++){
//              str [i]= input.next();
//          }
//        System.out.println(Arrays.toString(str));
        for (int num : arr){
            System.out.println(num + " ");

        }
        String[] str= new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
