package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class ItemAscByNameTest extends TestCase {

    @Test
    public void compareAscByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Daniil"));
        items.add(new Item(2, "Yan"));
        items.add(new Item(3, "Nikola"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(1, "Daniil"));
        expected.add(new Item(3, "Nikola"));
        expected.add(new Item(2, "Yan"));
        assertThat(items, is(expected));
    }

    @Test
    public void compareDescByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Daniil"));
        items.add(new Item(2, "Yan"));
        items.add(new Item(3, "Nikola"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(2, "Yan"));
        expected.add(new Item(3, "Nikola"));
        expected.add(new Item(1, "Daniil"));
        assertThat(items, is(expected));
    }
}