package ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovalTest {
    @Test
    public void removal_test(){
        ArrayList<String> test = new ArrayList<>();
        test.add("1");
        EmployeeRemoval.removeEmployee("1", test);
        assertEquals(test.size(), 0);
    }
}
