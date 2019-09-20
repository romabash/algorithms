package algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void bubbleSort() {
        int[] array = {2,1,4,3,5};
        int[] expectedSorted = {1,2,3,4,5};
        assertArrayEquals(expectedSorted, Sort.bubbleSort(array));
    }

    @Test
    public void selectionSort() {
        int[] array = {2,1,4,3,5};
        int[] expectedSorted = {1,2,3,4,5};
        assertArrayEquals(expectedSorted, Sort.selectionSort(array));
    }
}