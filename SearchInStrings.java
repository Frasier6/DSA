package com.frasier;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInStrings{
    public static void main(String[] args) {
        Scanner input=new Scanner((System.in));
        String name=input.nextLine();
        char target= 'i';
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (char character = 0; character <str.length(); character++) {
            char element= str.charAt(character);
                return true;

        }
    return false;

    }
}

