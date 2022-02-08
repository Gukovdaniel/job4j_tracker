package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String comp;

    public Programmer(String name, String surname, boolean education, int birthday, String comp) {
        super(name, surname, education, birthday);
        this.comp = comp;

    }


}
