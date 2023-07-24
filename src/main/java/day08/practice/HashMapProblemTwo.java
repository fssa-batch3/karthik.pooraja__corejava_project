package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import java.util.*;

public class HashMapProblemTwo {

    public static Map<String, List<String>> createDepartmentAndEmployeesMap(List<String> inputLines) {
        Map<String, List<String>> departmentAndEmployees = new HashMap<>();
        for (String inputLine : inputLines) {
            String[] parts = inputLine.split(",");
            if (parts.length == 2) {
                String deptName = parts[0].trim();
                String employeeName = parts[1].trim();

                departmentAndEmployees.putIfAbsent(deptName, new ArrayList<>());
                departmentAndEmployees.get(deptName).add(employeeName);
            } else {
                System.out.println("Invalid input format: " + inputLine);
            }
        }
        return departmentAndEmployees;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputLines = new ArrayList<>();

        System.out.println("Enter comma-separated DeptName, EmployeeName (type 'stop' to end input):");
        while (sc.hasNext()) {
            String inputLine = sc.nextLine();
            if (inputLine.equals("stop")) {
                break;
            }
            inputLines.add(inputLine);
        }

        Map<String, List<String>> departmentAndEmployees = createDepartmentAndEmployeesMap(inputLines);

        System.out.println("Department and List of Employees:");
        for (Map.Entry<String, List<String>> entry : departmentAndEmployees.entrySet()) {
            String deptName = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println(deptName + ": " + employees);
        }
    }
}
