package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            Predicate<Folder> size = folder -> f.getSize() > 100;
            Predicate<Folder> name = folder -> f.getName().contains("bug");
            size.test(f);
            name.test(f);
            rsl.add(f);
        }
        return new ArrayList<>();
    }
}