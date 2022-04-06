package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String drive() {
        return null;
    }

    @Override
    public int people(int p) {
        return 0;
    }

    @Override
    public int oil(int o, int price) {
        return price;
    }
}
