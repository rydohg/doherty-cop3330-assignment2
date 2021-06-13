package ex37;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import org.junit.jupiter.api.Test;

public class PassTest {
    @Test
    public void pass_test(){
        String pass = PassGenerator.generatePass(8, 2, 2);
    }
}
