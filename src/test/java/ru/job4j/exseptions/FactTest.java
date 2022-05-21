package ru.job4j.exseptions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

        @Test
        public void whenFactorialLessZero() {
            int rsl = Fact.calc(3);
            assertThat(rsl, is(6));
        }
    }