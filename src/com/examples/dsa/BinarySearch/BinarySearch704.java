package com.examples.dsa.BinarySearch;

public class BinarySearch704 {
    static void main() {
        int[] nums = {-1,0,3,5,9};
        int target = 12;

        int left=0;
        int right=nums.length-1;
        int index = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                index = mid;
                break;
            }else if(nums[mid]<target){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        System.out.println("Index of target "+index);
    }
}
