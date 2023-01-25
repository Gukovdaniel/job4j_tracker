package ru.job4j.collections;

import java.util.Comparator;

/**
 * -  делим входящие строки с помощью split() по /, помещаем результат в переменные
 *
 * - сравниваем первые элементы полученных массивов по убыванию с помощью compareTo(),
 * результат помещаем в переменную rsl
 *
 * - если rsl равен 0 - то возвращаем такое сравнение: o1.compareTo(o2) - иначе - переменную rsl
 */

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1arr = o1.split("/");
        String[] o2arr = o2.split("/");
        int rsl = o2arr[0].compareTo(o1arr[0]);
        return rsl == 0 ? o1.compareTo(o2) : rsl;
        }
    }