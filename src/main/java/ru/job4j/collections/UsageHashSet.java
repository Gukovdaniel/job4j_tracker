package ru.job4j.collections;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Toyota");
        autos.add("Toyota");
        autos.add("Volvo");
        for (String car : autos) {
            System.out.println(car);
        }
    }
}