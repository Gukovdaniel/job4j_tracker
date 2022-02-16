package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 3);
        Book book1 = new Book("Clean code", 1000);
        Book book2 = new Book("Библиотека профессионала", 1200);
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
    }
}

