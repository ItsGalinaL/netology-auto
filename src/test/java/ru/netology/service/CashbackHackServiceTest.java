package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int expectedAmount = 100;

        int actualAmount = new CashbackHackService().remain(900);

        assertEquals(actualAmount, expectedAmount, "Нужно докупить на 100 до кэшбека");
    }

    @Test
    public void testRemainAbove1000() {
        int expectedAmount = 999;

        int actualAmount = new CashbackHackService().remain(1001);

        assertEquals(actualAmount, expectedAmount, "Нужно докупить на 999 до кэшбека");
    }

    @Test
    public void testRemainEquals() {
        int expectedAmount = 0;

        int actualAmount = new CashbackHackService().remain(1000);

        assertEquals(actualAmount, expectedAmount, "Не нужно докупать");
    }

    @Test
    public void testRemain1() {
        int expectedAmount = 1;

        int actualAmount = new CashbackHackService().remain(999);

        assertEquals(actualAmount, expectedAmount, "Нужно докупить на 1 до кэшбека");
    }
}