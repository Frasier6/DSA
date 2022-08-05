package com.frasier;

public class minnum {
    public static void main(String[] args) {
        int[][] arr={{22,142,13},
                    {81,9,21},
                    {5,76,26} };
        System.out.println(min(arr));

    }
    public static int min(int[][] arr ){
        int minval=arr[0][0];
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col < row ; col++) {
                if(minval>arr[row][col]){
                    minval=arr[row][col];
                    return minval;

                }


            }

        }
    return -1;
    }
}
