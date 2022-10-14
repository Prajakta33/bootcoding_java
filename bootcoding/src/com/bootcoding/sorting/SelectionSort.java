package com.bootcoding.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={100,30,70,40,55};
        int min_index=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;

                }

            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }

        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }
}
