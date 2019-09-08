package com.search;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int item = 3;

        int idx = Search.linearSearch(list, item);
        System.out.println("Index of " + item + " is at index " + idx);
    }
}
