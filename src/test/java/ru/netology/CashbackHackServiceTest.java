package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



 class CashbackHackServiceTest {



    @Test
     void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
     void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    void testRemainWithCashbackMoreThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    void testRemainIfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    void testRemainIfAmountIsOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    void testRemainIfAmountIsNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;
        assertEquals(actual, expected);
    }

}