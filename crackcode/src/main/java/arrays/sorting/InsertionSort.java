package arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        int n = array.length - 1;
        for (int i = 1; i <= n; i++) {
            int j, valueToBeSort = array[i];
            for (j = i; j > 0 && array[j - 1] > valueToBeSort; j--) {
                array[j] = array[j - 1];
            }
            array[j] = valueToBeSort;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{1,5,6,2,3,4})));
    }
}
