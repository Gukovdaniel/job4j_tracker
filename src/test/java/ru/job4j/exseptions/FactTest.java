package ru.job4j.exseptions;

import org.junit.Test;

public class FactTest {

    public class testCalc {
        @Test(expected = IllegalArgumentException.class)
        public void whenFactorialLessZero() {
            Fact.calc(3);
        }
    }
}