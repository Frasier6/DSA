package com.frasier;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 12;
        System.out.println(Search(arr,target,1,4));
    }
    static int Search(int[] arr,int target,int start,int stop){
        if(arr.length==0){
            return -1;
                }
        for (int i = start; i <stop; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }

        }
        return -1;
    }
}
