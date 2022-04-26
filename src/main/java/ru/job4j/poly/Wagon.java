package ru.job4j.poly;

public class Wagon implements Vehicle{
    @Override
    public void move() {
        System.out.println("По асфальту!");
    }
}
