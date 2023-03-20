package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargeSum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}