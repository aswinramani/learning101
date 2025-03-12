package algos;

//import java.util.Arrays;

public class QuickSort {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
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
