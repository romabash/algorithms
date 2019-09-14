package algorithms;

public class MainApp {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int search = 9;

        int linearSearchIndex = Search.linearSearch(array, search);
        System.out.println("Linear Search.  Index of " + search + " is at index " + linearSearchIndex);

        int binarySearchIndex = Search.binarySearch(array, search);
        System.out.println("Binary Search.  Index of " + search + " is at index " + binarySearchIndex);

        int binarySearchRecursiveIndex = Search.binarySearch(array, search, 0, array.length-1);
        System.out.println("Recursive Binary Search.  Index of " + search + " is at index " + binarySearchRecursiveIndex);

    }
}
