package algorithms;

/**
 * Sorting algorithms
 * @author Roma
 */
public class Sort {

    /**
     * Uses Bubble Sort to sort an Array
     * Time Complexity - Best: O(n), Average: O(n^2), Worst: O(n^2)
     * Space Complexity - Worst: O(1)
     * @param array Array to sort
     * @return Returns sorted array
     */
    public static int[] bubbleSort(int[] array){

        int i, j, temp;
        for(i=0; i < array.length-1; i++){
            for(j=0; j < array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
