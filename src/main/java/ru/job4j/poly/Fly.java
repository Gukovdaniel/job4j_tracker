package ru.job4j.poly;

public class Fly implements Vehicle{
    @Override
    public void move() {
        System.out.println("Хорошего полета!");
    }
}
