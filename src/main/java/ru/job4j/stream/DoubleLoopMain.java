package ru.job4j.stream;

import java.util.stream.Stream;

public class DoubleLoopMain {
    public static void main(String[] args) {
        Stream.of(DoubleLoop.Suit.values())
                .flatMap(suit -> Stream.of(DoubleLoop.Value.values())
                        .map(value -> suit + " " + value))
                .forEach(System.out::println);
    }
}

