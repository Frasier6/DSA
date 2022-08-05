package com.frasier;

import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Apple" -> System.out.println("Red Fruit");
            case "banana" -> System.out.println("Yellow Fruit");
            case "Dragonfruit" -> System.out.println("pink fruit");
        }
    }
}
