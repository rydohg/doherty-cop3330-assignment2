package ex40;

import java.util.*;

public class FilterEmployees {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();
        employees.add(mapForEmployee("Tou", "Xiong\t\t", "Software Engineer", "2016-10-05"));
        employees.add(mapForEmployee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employees.add(mapForEmployee("Jake", "Jacobson\t", "Programmer\t", ""));
        employees.add(mapForEmployee("Jacquelyn", "Jackson", "DBA \t\t\t", ""));
        employees.add(mapForEmployee("Sally", "Webber\t", "Web Developer\t", "2015-12-28"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String searchString = scanner.nextLine().trim();
        scanner.close();

        System.out.println("Name\t\t\t\t| Position\t\t\t| Separation Date\n--------------------|-------------------|----------------");
        for (HashMap<String, String> employee : employees) {
            if (matches(employee, searchString)){
                System.out.println(employee.get("firstName") + " " + employee.get("lastName") + "\t| "
                        + employee.get("position") + "\t| " + employee.get("separationDate")
                );
            }
        }
    }

    private static HashMap<String, String> mapForEmployee(String firstName, String lastName, String position, String separationDate) {
        HashMap<String, String> employee = new HashMap<>();
        employee.put("lastName", lastName);
        employee.put("firstName", firstName);
        employee.put("position", position);
        employee.put("separationDate", separationDate);
        return employee;
    }

    public static boolean matches(HashMap<String, String> employee, String searchString){
        return employee.get("firstName").contains(searchString) || employee.get("lastName").contains(searchString);
    }
}