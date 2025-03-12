package algos;

public class QuickSort {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        System.out.println("i : " + i);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        return 0;
    }

    public void init(int[] arr, int low, int high) {
        System.out.println("arr length : " + String.valueOf(arr.length));
        System.out.println("low : " + low);
        System.out.println("high : " + high);
        // sort recursively using pivot and swap elements for sorting
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
        }
    }
}
