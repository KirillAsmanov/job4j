package ru.job4j.Test;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Calculator.Fit;

public class FitTest {
    @Test
    public void manWeight() {
        double in = 200;
        double expected = 115;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 120;
        double expected = 11.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}