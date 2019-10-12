package algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearchTest() {
        int[] array = {1,2,3,4,5};

        assertEquals(2, Search.binarySearch(array, 3));
        assertEquals(0, Search.binarySearch(array, 1));
        assertEquals(-1, Search.binarySearch(array, 9));
    }

    @Test
    public void recursiveBinarySearchTest() {
        int[] array = {1,2,3,4,5};

        assertEquals(2, Search.binarySearch(array, 3, 0, array.length-1));
        assertEquals(0, Search.binarySearch(array, 1, 0, array.length-1));
        assertEquals(-1, Search.binarySearch(array, 9, 0, array.length-1));
    }
}