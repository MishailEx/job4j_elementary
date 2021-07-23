package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when7Or9Then9() {
        int first = 7;
        int second = 9;
        int expected = 9;
        int out = Max.max(first, second);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void when10r9Then10() {
        int first = 10;
        int second = 9;
        int expected = 10;
        int out = Max.max(first, second);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void when7r7Then7() {
        int first = 7;
        int second = 7;
        int expected = 7;
        int out = Max.max(first, second);
        Assert.assertEquals(expected,out);
    }
    @Test
    public void when10Or7Or9Or2Then10() {
        int first = 10;
        int second = 7;
        int third = 9;
        int four = 2;
        int expected = 10;
        int out = Max.max(first, second, third, four);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when5Or8Or1Then8() {
        int first = 5;
        int second = 8;
        int third = 1;
        int expected = 8;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }
}