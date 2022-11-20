package ru.job4j.collections;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("gukov.danya92@gmail.com" , "Гуков Даниил Васильевич");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
    }
}
