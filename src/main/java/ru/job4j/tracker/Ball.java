package ru.job4j.tracker;

public class Ball {
    public void tryRun(Hare condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        } else System.out.println("Колобок сбежал");
    }
}

