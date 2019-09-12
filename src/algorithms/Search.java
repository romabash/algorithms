package com.search;

import java.util.List;

/**
 * Searching algorithms
 * @author Roma
 */
public class Search {

    /**
     * Uses Linear Search to check if the element is present the List
     * @param list List to search from
     * @param x Element to search for
     * @return Returns index of the element if present in the List, return -1 if not in the List
     */
    public static int linearSearch(List<Integer> list, int x) {

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == x) {
                return i;
            }
        }
        return -1;
    }
}