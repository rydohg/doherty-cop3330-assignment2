package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO: check against constraints
public class MonthsTillTest {
    @Test
    public void monthsTest(){
        assertEquals(PaymentCalculator.calculateMonthsUntilPaidOff(5000, .12, 100), 70.0);
    }
}
