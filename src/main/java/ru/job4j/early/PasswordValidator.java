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
        if (password.length() > 8 && password.length() < 32) {
            System.out.println("Password should be length [8,32]");
        }

        char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isUpperCase(x)) {
                System.out.println("Password should contain at least one uppercase letter");
            }
        }

        char[] array2 = password.toCharArray();
        for (char x : array2) {
            if (Character.isLowerCase(x)) {
                System.out.println("Password should contain at least one lowercase letter");
            }
        }
        return password;
    }
}

//boolean result=false;
//        char[] array=str.toCharArray();
//        for(char x:array){
//            if(Character.isUpperCase(x)){
//                result=true;
//                break;