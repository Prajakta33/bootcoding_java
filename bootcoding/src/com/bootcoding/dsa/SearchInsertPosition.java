package com.bootcoding.dsa;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int target = 3;
        int sum = 0;
        int a;
        int[] nums = {1, 3, 5, 6};

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                System.out.println(i);
            }
        }
    }
}

