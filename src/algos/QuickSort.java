package algos;

import java.util.Arrays;

public class QuickSort {
//    private int counter = 0;
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
//        System.out.println("i : " + i);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i+1;
    }

    public void init(int[] arr, int low, int high) {
//        System.out.println("low : " + low);
//        System.out.println("high : " + high);
//        counter++;
//        System.out.println("counter : " + counter);
        // sort recursively using pivot and swap elements for sorting
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            // sort left subArray
            init(arr, low, pivotIndex-1);
            // sort right subArray
            init(arr, pivotIndex + 1, high);
        }
    }
}
