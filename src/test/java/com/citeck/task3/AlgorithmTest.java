package com.citeck.task3;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AlgorithmTest {
    @Test
    public void whenChangeRightZeroToOne() {
        Algorithm algorithm = new Algorithm();
        int result = algorithm.replacement(500);
        assertThat(result, is(501));
    }
}