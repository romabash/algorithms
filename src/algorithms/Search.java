package algorithms;

/**
 * Searching algorithms
 * @author Roma
 */
public class Search {

    /**
     * Uses Linear Search to check if the element is present the Array
     * Time Complexity - Best: O(1), Average: O(n), Worst: O(n)
     * Space Complexity - Worst: O(1)
     * @param array Array to search from
     * @param x Element to search for
     * @return Returns index of the element if present in the Array, return -1 if not in the Array
     */
    public static int linearSearch(int[] array, int x){

        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Uses Binary Search to check if the element is present the Array
     * Time Complexity - Best: O(1), Average: O(log n), Worst: O(log n)
     * Space Complexity - Worst: O(1)
     * @param array Sorted Array to search from
     * @param x Element to search for
     * @return Returns index of the element if present in the Array, return -1 if not in the Array
     */
    public static int binarySearch(int[] array, int x){

        int start = 0;
        int end = array.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            // If element at given location is equals to x, return its index
            if (array[mid] == x){
                return mid;
            }

            if (x < array[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Uses Recursive Binary Search to check if the element is present the Array
     * Time Complexity - Best: O(1), Average: O(log n), Worst: O(log n)
     * Space Complexity - Worst: O(1)
     * @param array Sorted Array to search from
     * @param x Element to search for
     * @param start Start of the Array
     * @param end End of the Array
     * @return Returns index of the element if present in the Array, return -1 if not in the Array
     */
    public static int binarySearch(int[] array, int x, int start, int end){

        if (start > end) return -1;

        int mid = (start + end) / 2;
        if (array[mid] == x){
            return mid;
        } else if (x < array[mid]){
            end = mid - 1;
            return binarySearch(array, x, start, end);
        } else{
            start = mid + 1;
            return binarySearch(array, x, start, end);
        }
    }
}