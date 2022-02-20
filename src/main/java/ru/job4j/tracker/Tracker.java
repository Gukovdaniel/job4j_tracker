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

    public Item findAll() {
        Item[] rsl = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item it = items[i];
            if (it != null) {
                rsl[size] = it;
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        for (int i = 0; i < rsl.length; i++) {
            return rsl[i];
        }
        return null;
    }

    public Item findByName(String key) {
        Item[] rsl = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item it = items[i];
            if (        ) {

            }
        }
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