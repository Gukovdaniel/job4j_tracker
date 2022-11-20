package ru.job4j.collections;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task s : list) {
            numbers.add(s.getNumber());
        }
        return numbers;
    }
}