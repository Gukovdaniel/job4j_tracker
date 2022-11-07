package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password.equals(null)) {
            throw new IllegalArgumentException("Password cant be null!!!");
        }
        if (password.equalsIgnoreCase("qwerty") || password.equalsIgnoreCase("12345")
        || password.equalsIgnoreCase("admin") || password.equalsIgnoreCase("user")) {
            System.out.println("Password shouldnt contain substrings: qwerty, 12345, admin, user");
        }
        return password;
    }
}
