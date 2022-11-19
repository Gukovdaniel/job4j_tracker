package ru.job4j.collections;

import java.util.List;

public class ConvertList2Array {

    public static int[][] toArray(List<Integer> list, int cells) {
        int index = 0;
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        for (int group = 0; group < array.length; group++) {
            for (int column = 0; column < cells; column++) {
                if (index < list.size()) {
                    array[group][column] = list.get(index);
                } else {
                    array[group][column] = 0;
                }
                index++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}