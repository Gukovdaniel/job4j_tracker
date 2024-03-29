package ru.job4j.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> result = ConvertList.convert(in);
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(result).containsAll(expect);
    }

    @Test
    public void whenThreeList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        in.add(new int[] {2, 3, 4});
        List<Integer> result = ConvertList.convert(in);
        List<Integer> expect = Arrays.asList(1, 2, 3, 2, 3, 4);
        assertThat(result).containsAll(expect);
    }
}