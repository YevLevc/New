package com.solvd.laba.sorting;

public class Heap {
    public static void sort(int arr[]) {
        // Build heap
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);

        // One by one extract (Max) an element from heap and
        // replace it with the last element in the array
        for (int i = arr.length - 1; i >= 0; i--) {

            //arrA[0] is a root of the heap and is the max element in heap
            int x = arr[0];
            arr[0] = arr[i];
            arr[i] = x;

            // rcall max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree with node i
    static void heapify(int arr[], int heapSize, int i) {
        int largest = i; // Initialize largest as root
        int leftChildIdx = 2 * i + 1; // left = 2*i + 1
        int rightChildIdx = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (leftChildIdx < heapSize && arr[leftChildIdx] > arr[largest]) largest = leftChildIdx;

        // If right child is larger than largest so far
        if (rightChildIdx < heapSize && arr[rightChildIdx] > arr[largest]) largest = rightChildIdx;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursive call to heapify the sub-tree
            heapify(arr, heapSize, largest);
        }
    }
}