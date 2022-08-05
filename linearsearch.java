package com.frasier;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums={22,53,415,56,241,67,89,-2,-3};
        int target=53;
        int ans= Search(nums,target);
        System.out.println(ans);

    }
    static int Search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index <arr.length ; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }

        }
    return -1;
    }

}
