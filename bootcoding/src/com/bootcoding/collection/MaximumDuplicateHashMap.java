package com.bootcoding.collection;

import java.util.HashMap;

/**
 * Find maximum duplicate occurrance in a array
 *
 */

public class MaximumDuplicateHashMap {
    public static void main(String[] args) {
        MaximumDuplicateHashMap m1=new MaximumDuplicateHashMap();
        int[] a={20,10,10,10,30};
        int max=m1.maximumDuplicate(a);
       // System.out.println(max);

    }

    public int maximumDuplicate(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (countMap.containsKey(arr[i])) {
                int value = countMap.get(arr[i]);
                countMap.put(arr[i], value + 1);
            } else {
                countMap.put(arr[i], 1);
            }
        }
        int max = 0;
        for (Integer value : countMap.values()) {
            if (value > max) {
                //max = max + value;
                System.out.println(value);
            }
            max=value;
        }
        return max;
    }
}
