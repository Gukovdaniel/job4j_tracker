package ru.job4j.inheritance;

public class Builder extends Engineer {

    private double experience;

    public Builder(String name, String surname, boolean education, int birthday) {
        super(name, surname, education, birthday);
    }
}
