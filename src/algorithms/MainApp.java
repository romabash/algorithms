package algorithms;

public class MainApp {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int item = 3;

        int linearSearchIndex = Search.linearSearch(array, item);
        System.out.println("Linear Search.  Index of " + item + " is at index " + linearSearchIndex);

        int binarySearchIndex = Search.binarySearch(array, item);
        System.out.println("Binary Search.  Index of " + item + " is at index " + binarySearchIndex);

    }
}
