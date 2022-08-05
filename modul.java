package com.frasier;

import java.util.Scanner;

public class modul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENter your number");
        int a = input.nextInt();
        int ans = a % 10; //% gives remainder and / gives quotient
        System.out.println(ans);
    }
}
