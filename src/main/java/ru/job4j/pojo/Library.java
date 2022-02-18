package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 300);
        Book book1 = new Book("Java 8. Полное руководство", 1376);
        Book book2 = new Book("Clean code", 300);
        Book book3 = new Book("Head First Java", 900);
        Book[] bk = new Book[4];
        bk[0] = book;
        bk[1] = book1;
        bk[2] = book2;
        bk[3] = book3;
        for (int index = 0; index < bk.length; index++) {
            Book b = bk[index];
            System.out.println(b.getName() + " - " + b.getPage());
        }
        System.out.println();

            Book temp = bk[0];
            bk[0] = bk[3];
            bk[3] = temp;
        for (int index = 0; index < bk.length; index++) {
            Book b = bk[index];
            System.out.println(b.getName() + " - " + b.getPage());
        }
        System.out.println();

        for (int index = 0; index < bk.length; index++) {
            Book b = bk[index];
            if (b.getName().equals(book.getName())) {
                System.out.println(b.getName() + " - " + b.getPage());
            }
        }
    }
}


