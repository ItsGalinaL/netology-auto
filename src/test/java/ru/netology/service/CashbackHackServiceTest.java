package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int expectedAmount = 100;

        int actualAmount = new CashbackHackService().remain(900);

        assertEquals("Нужно докупить на 100 до кэшбека", expectedAmount, actualAmount);
    }

    @Test
    public void testRemainAbove1000() {
        int expectedAmount = 999;

        int actualAmount = new CashbackHackService().remain(1001);

        assertEquals("Нужно докупить на 999 до кэшбека", expectedAmount, actualAmount);
    }

    @Test
    public void testRemainEquals() {
        int expectedAmount = 0;

        int actualAmount = new CashbackHackService().remain(1000);

        assertEquals("Не нужно докупать", expectedAmount, actualAmount);
    }

    @Test
    public void testRemain1() {
        int expectedAmount = 1;

        int actualAmount = new CashbackHackService().remain(999);

        assertEquals("Нужно докупить на 1 до кэшбека", expectedAmount, actualAmount);
    }
}
