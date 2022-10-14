package com.bootcoding.collection;

import java.util.HashMap;

/**
 *
 * Find how many duplicates are in a given array
 * Ex.input : a={10,20,10,30,20,30,40};
 *    output : 3
 *
 *
 */
public class DuplicateHashMap {

    // single line comment
    /*
    Multi line comment
    */

    public static void main(String[] args) {
        DuplicateHashMap f1=new DuplicateHashMap();
        int[] a={10,20,10,30,20,30,40 };
        int duplicate = f1.findDuplicate(a);
        System.out.println(duplicate);

    }
    public int findDuplicate(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            /**
             * ContainsKey -> to check whether key exists or not and return value of a key
             */
            if (countMap.containsKey(arr[i])) {
                int value = countMap.get(arr[i]);
                countMap.put(arr[i], value + 1);
            } else {
                countMap.put(arr[i], 1);
            }
        }
        int count = 0;
        for (Integer value : countMap.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }
}
