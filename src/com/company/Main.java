package com.company;

import java.util.Arrays;

public class Main {
    public  int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int a=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){ // it will check ( from 1st index( because i+1) till n(3)
                a=nums[i]+nums[j];
                if(a==target){
                    return new int[] {i,j};
                }}}

        return new int[]{};
    }
    public static void main(String[] args) {
	// write your code here
        int [] nums={3,2,3};
        int target=6;
        Main m= new Main();
        System.out.println(Arrays.toString(m.twoSum(nums,target)));

    }
}
