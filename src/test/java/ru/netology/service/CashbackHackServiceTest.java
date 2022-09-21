package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturnZeroCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnOneCashbackCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnOneCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        org.junit.Assert.assertEquals(actual, expected);
    }
}