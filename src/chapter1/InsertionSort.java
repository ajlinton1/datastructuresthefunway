package chapter1;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;
import org.junit.*;


public class InsertionSort {

    @Test
    public void insertionSort() {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        int[] sorted = { 1, 2, 3, 4, 5, 6 };

        int n = arr.length;
        int i = 1;
        while (i < n) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
                arr[j + 1] = current;
            }
            i = i + 1;
        }

        assertArrayEquals(sorted, arr);
    }
}
