package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {

    private static final  LocalDateTime created = LocalDateTime.now();

    private int id;

    private String name;

    public  Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static final LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{"
                +
                "id="
                + id
                + ", name='"
                + name
                + '\''
                + '}';
    }
}