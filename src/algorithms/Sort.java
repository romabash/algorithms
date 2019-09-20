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
        int size = array.length;
        for(i=0; i < size-1; i++){
            for(j=0; j < size-1-i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Uses Selection Sort to sort an Array
     * Time Complexity - Best: O(n^2), Average: O(n^2), Worst: O(n^2)
     * Space Complexity - Worst: O(1)
     * @param array Array to sort
     * @return Returns sorted array
     */
    public static int[] selectionSort(int[] array){

        int i, j, minValue, minIndex, temp;
        int size = array.length;
        for(i=0; i < size; i++){
            minValue = array[i];
            minIndex = i;
            for(j=i; j < size; j++){
                if(array[j] < minValue){
                    minValue = array[j];
                    minIndex = j;
                }
            }
            // Check if the minValue is the first element of iteration
            if(minValue < array[i]) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}
