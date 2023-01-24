package ru.job4j.collections;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            String[] array = value.split("/");
            for (String el : value.split("/")) {
                if (array[0].equals(el)) {
                    tmp.add(el);
                    start += el;
                } else {
                    start += "/" + el;
                    tmp.add(start);
                }
            }
        }

        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
