package ru.job4j.queue;

public record Customer(String name, int amount) {
    @Override
    public String toString() {
        return name;
    }
}
