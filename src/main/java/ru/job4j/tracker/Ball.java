package ru.job4j.tracker;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        }
        else {
            System.out.println("Колобок сбежал");
        }
    }
}

