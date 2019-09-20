package algorithms;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int search = 3;

        int linearSearchIndex = Search.linearSearch(array, search);
        System.out.println("Linear Search.  Index of " + search + " is at index " + linearSearchIndex);

        int binarySearchIndex = Search.binarySearch(array, search);
        System.out.println("Binary Search.  Index of " + search + " is at index " + binarySearchIndex);

        int binarySearchRecursiveIndex = Search.binarySearch(array, search, 0, array.length-1);
        System.out.println("Recursive Binary Search.  Index of " + search + " is at index " + binarySearchRecursiveIndex);

        int[] unsortedArray = {2,1,4,3,5};
        int[] BubbleSortedArray = Sort.bubbleSort(unsortedArray);
        System.out.println("Sorted Array using Bubble Sort: " + Arrays.toString(BubbleSortedArray));

        int[] selectionSortedArray = Sort.bubbleSort(unsortedArray);
        System.out.println("Sorted Array using Selection Sort: " + Arrays.toString(selectionSortedArray));

    }
}
