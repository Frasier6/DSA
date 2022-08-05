package com.frasier;

import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isArm(n));
        for (int i=100;i<1000;i++){
            if (isArm(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isArm(int n){
        int original =n;
        int sum =0;

        while (n>0){
            int rem = n % 10;
            n =n /10;
            sum = sum + rem*rem*rem;

        }
        return sum == original;
    }
}
