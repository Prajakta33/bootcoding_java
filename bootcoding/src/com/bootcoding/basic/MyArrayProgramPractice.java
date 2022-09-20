package com.bootcoding.basic;

public class MyArrayProgramPractice {
    public static void main(String[] args){
        MyArrayProgramPractice map=new MyArrayProgramPractice();
        double e[]={33.5,26.77,98.23,67.98};
        map.printAllElements(e);
        double d[];
       d= map.getHalfArray(e);
        System.out.println("\nHalf array");
       //for(int i=0;i<d.length;i++){
        //   System.out.println(d[i]);
      // }
        map.printAllElements(d);


    }

    public void printAllElements(double[] d){
        for(int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }
    }
    public double[] getHalfArray(double[] d){
        int size=d.length;
        double half[]=new double[size/2];
        for(int i=0;i<half.length;i++){
            half[i]=d[i];
        }
        return half;
    }


    }



