package ru.job4j.collections;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = o1.compareTo(o2);
        if (rsl == 0) {
            return o2.length() - o1.length();
        }
        return rsl;
    }
}