package algorithms;

/**
 * Searching algorithms
 * @author Roma
 */
public class Search {

    /**
     * Uses Linear Search to check if the element is present the List
     * @param array List to search from
     * @param x Element to search for
     * @return Returns index of the element if present in the List, return -1 if not in the List
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

    public static int binarySearch(int[] array, int x){

        int start = 0;
        int end = array.length -1;

        while(start <= end){
            int middle = start + ((end - start) / 2);
            // If element at given location is equals to x, return its index
            if (array[middle] == x){
                return middle;
            }

            if (x < array[middle]){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        return -1;
    }
}