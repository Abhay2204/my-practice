package sum;

import java.util.Scanner;

public class sum {

    // Java Program for Binary Insertion Sort

        // A utility function to insert a given key in the sorted subarray
        // arr[0..i-1] by using binary search
        public static void insert(int[] arr, int i) {
            // Store the key to be inserted
            int key = arr[i];
            // Initialize the left and right pointers
            int left = 0;
            int right = i - 1;
            // Find the index where the key should be inserted by binary search
            while (left <= right) {
                // Find the middle index
                int mid = (left + right) / 2;
                // Compare the key with the middle element
                if (key < arr[mid]) {
                    // If the key is smaller, move the right pointer to the left of mid
                    right = mid - 1;
                } else {
                    // If the key is larger or equal, move the left pointer to the right of mid
                    left = mid + 1;
                }
            }
            // Shift the elements from left to i-1 to the right by one position
            for (int j = i - 1; j >= left; j--) {
                arr[j + 1] = arr[j];
            }
            // Insert the key at the found index
            arr[left] = key;
        }

        // Function to sort an array using binary insertion sort
        public static void sort(int[] arr) {
            // Loop from the second element to the last element
            for (int i = 1; i < arr.length; i++) {
                // Insert the current element in the sorted subarray using binary search
                insert(arr, i);
            }
        }

        // A utility function to print an array of size n
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Driver program to test above function
        public static void main(String[] args) {
            int[] arr = {37, 23, 0, 17, 12, 72, 31, 46, 100, 88, 54};
            System.out.println("Unsorted array: ");
            printArray(arr);
            sort(arr);
            System.out.println("Sorted array: ");
            printArray(arr);
        }
    }






