package Array;

import java.util.Arrays;

public class SingleArrayEx1 {
    public static void main(String args[]) {
        // Initializing the array
        int a[] = {12, 34, 55, 16, 48};

        // Displaying the original array
        System.out.println("Original Array:");
        for (int i : a) {
            System.out.println(i);
        }

        // Finding the minimum element
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Minimum value: " + min);

        // Finding the maximum element
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value: " + max);

        // Sorting the array using Arrays.sort()
        Arrays.sort(a);

        // Displaying the sorted array
        System.out.println("Sorted Array:");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
