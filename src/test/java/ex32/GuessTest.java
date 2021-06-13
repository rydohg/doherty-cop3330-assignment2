package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessTest {
    @Test
    @DisplayName("Random Number Tester")
    public void random_num(){
        int one = GuessNum.randomNumber(1);
        int two = GuessNum.randomNumber(2);
        int three = GuessNum.randomNumber(3);
        assertTrue(one >= 0 && one <= 10);
        assertTrue(two >= 0 && two <= 100);
        assertTrue(three >= 0 && three <= 1000);
    }
}
