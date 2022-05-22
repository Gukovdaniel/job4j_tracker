package ru.job4j.exseptions;

import org.junit.Test;

public class FactTest {

        @Test(expected = IllegalArgumentException.class)
        public void whenFactorialLessZero() {
            Fact.calc(-3);
        }
}