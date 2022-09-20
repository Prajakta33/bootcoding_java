package com.bootcoding.basic;

public class ArrayExample {
    public static void main(String[] args) {
        //Example 1
        int[] a = {10, 15, 20, 25, 30};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //Example 2
        String[] b = {"Apple", "Avocado", "Grapes", "Pineapple", "Watermelon"};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        //Example 3
        String[] c = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }   //Example 4
        int[] d = {10, 15, 20, 25, 35, 75, 80, 95};
        for (int i = 0; i < d.length; i++) {
            if (d[i] % 2 == 0) {
                System.out.println(d[i] + "\n");
            }
        }
        //Example 5
        int[] e = {10, 15, 20, 25, 35, 75, 80, 95};
        for (int i = 7; i >= 0; i--) {
            System.out.print(e[i] + " " + "\n");
        }

        //Example 6
        int[] f = {10, 15, 20, 25, 35, 80, 80, 95};
        boolean Found = false;
        for (int i = 0; i < f.length; i++) {
            if (f[i] == 80) {
                Found = true;
            }
        }
        if (Found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        //Example 7
        int[] g = {10, 15, 20, 25, 35, 75, 80, 95};
        for (int i = 0; i < g.length; i++) {
            if (g[i] >= 30 && g[i] < 100) {
                System.out.println(g[i] + "\n");
            }
        }

        //Example 8
        int[] h = {10, 15, 20, 25, 35, 75, 80, 95};
        int max = 0;
        for (int i = 0; i < h.length; i++) {
            //int max = 0;
            if (h[i] > max) {
                System.out.println(h[i]);
            }
            max = h[i];
        }
    }
}

