package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item it = items[i];
            if (it != null) {
                rsl[size] = it;
                size++;
            }
        }
        rsl = Arrays.copyOf(items, size);
        for (int i = 0; i < rsl.length; i++) {
            return rsl[i];
        }
        return Arrays.copyOf(items, size);
    }

    public Item findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            int t = 0;
            Item item = items[i];
            if (key.equals(item.getName())) {
                rsl[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(items, count);
    }



    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}