package ex33;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EightBallTest {
    @Test
    public void eight_ball_test(){
        String guess = EightBall.askQuestion();
        assertTrue(guess.equals("Yes.") || guess.equals("No.") || guess.equals("Ask again later.") || guess.equals("Maybe."));
    }
}
