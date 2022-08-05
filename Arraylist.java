package com.frasier;

import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(55);
//        list.add(26);
//        list.add(678);
//        list.add(59);
//        list.add(4);

//        list.set(0,22);
//        list.remove(4);
//        System.out.println(list);

//        for(int i=0;i<5;i++){
//            System.out.println("Enter ur no: ");
//            list.add(input.nextInt());
//        }
//
//        for(int i=0;i<5;i++){
//            System.out.print(list.get(i)+" ");
//        }
//        -------------------------------------------------------------------------
//        int[] arr ={1,23,56,7,8,};
//        swap(arr,1,3);
//        System.out.println(Arrays.toString(arr));
//
//    }
//    static void swap(int[] arr, int index1,int index2){
//        int temp = arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//
//
//    }
        int [] arr = {1,8,4,6,3,66,4,11};
        System.out.println(max(arr));

    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
       }
    return maxVal;
    }
}
