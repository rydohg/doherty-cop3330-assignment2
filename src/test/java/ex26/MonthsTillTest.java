package ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO: check against constraints
public class MonthsTillTest {
    @Test
    public void monthsTest(){
        assertEquals(PaymentCalculator.calculateMonthsUntilPaidOff(5000, .12, 100), 70.0);
    }
}
