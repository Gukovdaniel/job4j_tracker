package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("test");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedCreatedTime = item.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + formattedCreatedTime);
    }
}
