package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

    public class MagicBall {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Scanner q = new Scanner(System.in);
            System.out.println("Hello, whats your name?");
            String name = input.nextLine();
            System.out.println(name + ", What do you want to know?");
            String qu = q.nextLine();
            int ans = new Random().nextInt(3);
            if (ans == 0) {
                System.out.println("Yes!");
            } else if (ans == 1) {
                System.out.println("No...");
            } else {
                System.out.println("Maybe)");
            }

        }
    }
