package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class UsagePackageDate {

    public static void main(String[] args) {
        Item item = new Item();
        item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    }
}
