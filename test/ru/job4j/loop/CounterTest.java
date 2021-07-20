package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void whenSumEvenNumbersFrom5ToTenThenThirty() {
        int start = 5;
        int finish = 10;
        int expected = 24;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void whenSumFromOneToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected,out);
    }
}