package com.search;

import java.util.List;

public class Search {

    public static int linearSearch(List<Integer> list, int elem) {

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == elem) {
                return i;
            }
        }
        return -1;
    }
}