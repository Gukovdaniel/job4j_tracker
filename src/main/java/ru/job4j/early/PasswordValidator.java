package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password.equalsIgnoreCase(null)) {
            throw new IllegalArgumentException("Password cant be null!!!");
        }
        String[] ignore = new String[] {"qwerty", "12345", "admin", "user" };
        for (String s : ignore) {
            if (s.equalsIgnoreCase(password)) {
                System.out.println("Password should not contain substrings: qwerty, 12345, admin, user");
            }
        }

        if (password.length() < 8 && password.length() > 32) {
            System.out.println("Password should be length [8,32]");
        }

        boolean up = false;
        char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isUpperCase(x)) {
                up = true;
            } else {
                continue;
            }
        }
        boolean lo = false;
        char[] array2 = password.toCharArray();
        for (char x : array2) {
            if (Character.isLowerCase(x)) {
                lo = true;
            } else {
                continue;
            }
        }
        boolean nm = false;
        char[] array3 = password.toCharArray();
        for (char x : array3) {
            if (Character.isDigit(x)) {
                nm = true;
            } else {
                continue;
            }
        }
        boolean iso = false;
        char[] array4 = password.toCharArray();
        for (char x : array4) {
            if (Character.isISOControl(x)) {
                iso = true;
            } else {
                continue;
            }
        if (!up) {
            System.out.println("Password should contain at least one uppercase letter");
        }
        if (!lo) {
                System.out.println("Password should contain at least one lowercase letter");
            }
        if (!nm) {
                System.out.println("Password should contain at least one figure");
            }
        if (!iso) {
                System.out.println("Password should contain at least one symbol");
            }
        } return password;
    }
}
