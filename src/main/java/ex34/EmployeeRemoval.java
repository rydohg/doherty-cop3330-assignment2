package ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRemoval {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        printEmployees(employees);

        System.out.print("Enter an employee name to remove: ");
        Scanner scanner = new Scanner(System.in);
        removeEmployee(scanner.nextLine(), employees);
        printEmployees(employees);
    }
    public static void removeEmployee(String employeeToRemove, ArrayList<String> employees){
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).equals(employeeToRemove)){
                employees.remove(i);
                break;
            }
        }
    }
    public static void printEmployees(ArrayList<String> employees){
        System.out.println("There are " + employees.size() + " employees");
        for (String s : employees) {
            if (s != null){
                System.out.println(s);
            }
        }
    }
}
