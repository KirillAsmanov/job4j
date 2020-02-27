package ru.job4j.Test;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance(){
        int inx1 = 0;
        int iny1 = 0;
        int inx2 = 2;
        int iny2 = 0;
        double excepted = 2;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
