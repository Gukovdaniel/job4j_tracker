package ru.job4j.io;

import java.util.Scanner;

    public class MagicBall {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Hello, whats your name?");
            String name = input.nextLine();
            System.out.println(name + ", Glad to see you!");
        }
    }
