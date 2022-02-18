package ru.job4j.pojo;

public class Book {
    private String name;
    private int page;

    public Book(String name, int page) {
        this.name = name;
        this.page = page;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public static int[] moveBook(int[] bk) {
        int temp = bk[0];
        bk[0] = bk[3];
        bk[3] = temp;
        return bk;
    }
}
