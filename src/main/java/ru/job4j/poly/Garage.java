package ru.job4j.poly;

public class Garage {
    public static void main(String[] args) {
        Vehicle il62 = new Fly();
        Vehicle sapsan = new Train();
        Vehicle sprinter = new Wagon();

        Vehicle[] vehicles = new Vehicle[]{il62, sapsan, sprinter};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
