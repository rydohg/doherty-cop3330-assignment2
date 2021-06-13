package ex29;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class BadInputTest {
    @Test
    public void badInputTest(){
        ByteArrayInputStream inputStream = new ByteArrayInputStream("0\n1\n".getBytes());
        System.setIn(inputStream);
    }
}
