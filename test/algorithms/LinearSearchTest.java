package algorithms;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;



public class LinearSearchTest {

    @Test
    public void linearSearchTest() {
        int[] array = {1,2,3,4,5};

        assertEquals(2, Search.linearSearch(array, 3));
        assertEquals(0, Search.linearSearch(array, 1));
        assertEquals(-1, Search.linearSearch(array, 9));
    }

    @Test
    public void linearSearchIntegerListTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(2, Search.linearSearch(list, 3));
        assertEquals(0, Search.linearSearch(list, 1));
        assertEquals(-1, Search.linearSearch(list, 9));
    }

    @Test
    public void linearSearchStringListTest() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        assertEquals(2, Search.linearSearch(list, "three"));
        assertEquals(0, Search.linearSearch(list, "one"));
        assertEquals(-1, Search.linearSearch(list, "nine"));
    }
}