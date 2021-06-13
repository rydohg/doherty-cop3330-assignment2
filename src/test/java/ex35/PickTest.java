package ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PickTest {
    @Test
    public void pick_a_winner(){
        ArrayList<String> players = new ArrayList<>();
        players.add("1");
        players.add("2");
        String winner = PickAWinner.pickWinner(players);
        assertTrue(winner.equals("1") || winner.equals("2"));
    }
}
