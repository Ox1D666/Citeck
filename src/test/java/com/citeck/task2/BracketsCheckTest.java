package com.citeck.task2;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BracketsCheckTest {
    @Test
    public void whenBracketsClosedCorrectly() {
        BracketsCheck bracketsCheck = new BracketsCheck();
        boolean result = bracketsCheck.check("([][[]()])");
        assertThat(result, is(true));
    }

    @Test
    public void whenBracketsClosedWrong() {
        BracketsCheck bracketsCheck = new BracketsCheck();
        boolean result = bracketsCheck.check("([][]()])");
        assertThat(result, is(false));
    }
}