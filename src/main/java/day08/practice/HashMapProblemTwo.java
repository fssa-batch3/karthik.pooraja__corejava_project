package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMapProblemTwo {
	public static void main(String[] args) {
        Map<String, List<String>> departmentEmployees = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter comma-separated DeptName, EmployeeName (type 'stop' to end input):");
        while (sc.hasNext()) {
            String inputLine = sc.nextLine();
            if (inputLine.equals("stop")) {
                break;
            }
            String[] parts = inputLine.split(",");
            if (parts.length == 2) {
                String deptName = parts[0].trim();
                String employeeName = parts[1].trim();

                departmentEmployees.(deptName, new ArrayList<>());
                departmentEmployees.get(deptName).add(employeeName);
            } else {
                System.out.println("Invalid input format: " + inputLine);
            }
        }

        System.out.println("Department and List of Employees:");
        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            String deptName = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println(deptName + ": " + employees);
        }
    }

}
