package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void people(int p) {
        System.out.println("people");
    }

    @Override
    public int oil(int o, int price) {
        return price;
    }
}
