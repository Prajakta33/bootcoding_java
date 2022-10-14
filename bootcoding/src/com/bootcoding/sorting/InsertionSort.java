package com.bootcoding.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={100,30,70,40,55};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            j=j+1;
            arr[j]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
