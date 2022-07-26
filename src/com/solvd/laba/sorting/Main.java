package com.solvd.laba.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 8, 6, 9, 7, 0};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {0, 1, 5, 11, 9, 0, 6, 10, 18, 3};
        Heap.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
