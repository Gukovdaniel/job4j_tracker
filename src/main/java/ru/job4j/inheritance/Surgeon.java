package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean scalpel;

    public Surgeon(String name, String surname, boolean education, int birthday) {
        super(name, surname, education, birthday);
    }
}
