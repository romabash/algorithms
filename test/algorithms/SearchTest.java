package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void linearSearchTest() {
        int[] array = {1,2,3,4,5};

        assertEquals(2, Search.linearSearch(array, 3));
        assertEquals(0, Search.linearSearch(array, 1));
        assertEquals(-1, Search.linearSearch(array, 9));
    }

    @Test
    public void binarySearchTest() {
        int[] array = {1,2,3,4,5};

        assertEquals(2, Search.binarySearch(array, 3));
        assertEquals(0, Search.binarySearch(array, 1));
        assertEquals(-1, Search.binarySearch(array, 9));
    }
}