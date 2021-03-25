package com.citeck.task1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortingTest {
    @Test
    public void whenSortFiveNumbers() {
        Sorting sorting = new Sorting();
        Integer[] nums = {4, 8, 4, 5, 8, 3, 4, 3, 7, 7};
        Set<Number> result = sorting.sort(nums);
        Set<Number> expect = new HashSet<>();
        expect.add(new Number(4, 3));
        expect.add(new Number(3, 2));
        expect.add(new Number(7, 2));
        expect.add(new Number(8, 2));
        expect.add(new Number(5, 1));
        assertThat(result, is(expect));
    }
}