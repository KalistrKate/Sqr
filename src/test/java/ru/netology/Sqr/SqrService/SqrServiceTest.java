package ru.netology.Sqr.SqrService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SqrServiceTest {
    @Test
    public void calcSqrtInTheRange() {
        SqrService service = new SqrService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcSqrtOutTheRange() {
        SqrService service = new SqrService();

        int expected = 0;
        int actual = service.calcSqr(10, 99);

        Assertions.assertEquals(expected, actual);
    }
}