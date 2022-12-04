package ru.job4j.collections;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        for (int i = 0; i < Math.min(o1.length(), o2.length()) - 1; i++) {
            int x = Character.compare(o1.charAt(i), o2.charAt(i));
            if (x != 0) {
                return x;
            }
        }
        return Integer.compare(o1.length(), o2.length());
    }
}

