package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        return;
    }

    @Override
    public void people(int p) {
        return;
    }

    @Override
    public int oil(int o, int price) {
        return price;
    }
}
