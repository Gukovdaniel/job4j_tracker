package ru.job4j.exseptions;

import java.lang.Exception;

public class FindEl extends Exception {
    public static int indexOf(String[] value, String key) {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String value[] = {"Petr", "Daniil", "Igor"};
            System.out.println(indexOf(value, "Daniil"));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


    }
}




