package ru.job4j.collections;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] numbAndStringLeft = left.split(".");
        String leftNumber = numbAndStringLeft[0];
        String[] numbAndStringRight = right.split(".");
        String rightNumber = numbAndStringRight[0];
        int l = Integer.parseInt(leftNumber);
        int r = Integer.parseInt(rightNumber);
        return Integer.compare(l, r);
    }
}