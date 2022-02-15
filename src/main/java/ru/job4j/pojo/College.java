package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student;
        student = new Student();
        student.setFio("Иванов Иван Иванович; ");
        student.setNumber(3);
        student.setCreated(new Date());

        System.out.println(student.getFio() + student.getNumber() + " group; " + student.getCreated() + "admitted to study");
    }
}
