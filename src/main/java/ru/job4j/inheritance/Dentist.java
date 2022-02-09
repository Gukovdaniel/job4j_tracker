package ru.job4j.inheritance;

import javax.tools.Diagnostic;

public class Dentist extends Doctor {

    private boolean drill;

    public Dentist(String name, String surname, boolean education, int birthday) {
        super(name, surname, education, birthday);

    }

}
