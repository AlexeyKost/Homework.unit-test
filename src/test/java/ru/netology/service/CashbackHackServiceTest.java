package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testHigherSum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }


}
