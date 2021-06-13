package ex39;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.*;

public class SortEmployees {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();

        employees.add(mapForEmployee("Tou", "Xiong\t\t", "Software Engineer", "2016-10-05"));
        employees.add(mapForEmployee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employees.add(mapForEmployee("Jake", "Jacobson\t", "Programmer\t", ""));
        employees.add(mapForEmployee("Jacquelyn", "Jackson", "DBA \t\t\t", ""));
        employees.add(mapForEmployee("Sally", "Webber\t", "Web Developer\t", "2015-12-28"));

        sort(employees);

        System.out.println("Name\t\t\t\t| Position\t\t\t| Separation Date\n--------------------|-------------------|----------------");
        for (HashMap<String, String> employee : employees) {
            System.out.println(employee.get("firstName") + " " + employee.get("lastName") + "\t| "
                    + employee.get("position") + "\t| " + employee.get("separationDate")
            );
        }
    }

    public static HashMap<String, String> mapForEmployee(String firstName, String lastName, String position, String separationDate) {
        HashMap<String, String> employee = new HashMap<>();
        employee.put("lastName", lastName);
        employee.put("firstName", firstName);
        employee.put("position", position);
        employee.put("separationDate", separationDate);
        return employee;
    }

    public static void sort(ArrayList<HashMap<String, String>> list){
        // Googling how to do lambda functions then having intellij simplify it makes this code crazy small
        list.sort(Comparator.comparing(stringStringHashMap -> stringStringHashMap.get("lastName")));
    }
}
