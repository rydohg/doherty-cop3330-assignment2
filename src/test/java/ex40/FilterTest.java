package ex40;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterTest {
    @Test
    @DisplayName("matches()")
    public void matches_test(){
        HashMap<String, String> employee = new HashMap<>();
        employee.put("lastName", "Jacobson");
        employee.put("firstName", "Jake");
        assertTrue(FilterEmployees.matches(employee, "Jac"));
    }
    @Test
    @DisplayName("doesn't matches()")
    public void doesnt_match(){
        HashMap<String, String> employee = new HashMap<>();
        employee.put("lastName", "Jacobson");
        employee.put("firstName", "Jake");
        assertFalse(FilterEmployees.matches(employee, "idk"));
    }
}
