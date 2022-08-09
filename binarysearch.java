package com.frasier;

public class binarysearch {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7,8,12,22,25,29};
        int target=25;
        int ans = binarySear(arr,target);
        System.out.println(ans);

    }
    static int binarySear(int[] arr,int target){
        int start =0;
        int end = arr.length -1;
        while(start<=end){
            int mid= start+ end-start /2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;

            }
            else{
                return mid;
            }
        }



    return -1;
    }
}
