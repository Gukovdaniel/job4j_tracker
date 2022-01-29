package ru.job4j.oop;

public class Error {
    public static void main(String[] args) {
        Error error2 = new Error();
        error2.printInfo();
    }

    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }
}
