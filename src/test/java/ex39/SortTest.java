package ex39;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {
    @Test
    @DisplayName("isSorted?")
    public void is_sorted(){
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();
        employees.add(SortEmployees.mapForEmployee("Tou", "Xiong\t\t", "Software Engineer", "2016-10-05"));
        employees.add(SortEmployees.mapForEmployee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        SortEmployees.sort(employees);

        assertEquals("Michaela", employees.get(0).get("firstName"));
    }
}
