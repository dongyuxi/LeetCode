package com.leetcode.problem.utils;

import java.util.List;

public class Utils {

    public static <T> void showArray(T[] array) {
        for (T a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static <T> void showList(List<T> list) {
        for (T l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
}