package com.solvd.laba.sorting;

public class Selection {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int least = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[least])
                    least=j;
            }
            swap (arr,i,least);
        }

    }

    public static void swap(int[]arr, int a, int b) {
        int x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
    }
}
