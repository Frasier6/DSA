package com.frasier;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 23597;
        int ans=0;
        while (num>0){
            int rem =num % 10;
            num = num / 10;

            ans = ans *10 + rem;

        }
        System.out.println(ans);
    }
}
