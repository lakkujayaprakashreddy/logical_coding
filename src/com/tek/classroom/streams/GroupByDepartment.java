package com.tek.classroom.streams;

import com.tek.streams.Employee;

import java.util.*;
import java.util.stream.Collectors;
class Employeee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employeee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}
public class GroupByDepartment {

    public static void main(String[] args) {

        List<Employeee> employees = Arrays.asList(
                new Employeee(1, "John", "IT", 60000),
                new Employeee(2, "Sara", "HR", 50000),
                new Employeee(3, "Mike", "IT", 70000),
                new Employeee(4, "Anna", "Finance", 65000),
                new Employeee(5, "David", "HR", 55000)
        );

        Map<String, List<Employeee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment));

        grouped.forEach((dept, empList) -> {
            System.out.println(dept + " -> " + empList);
        });

        Employeee highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employeee::getSalary))
                .orElseThrow(() -> new RuntimeException("No employees found"));

        System.out.println("Highest Paid Employee: " + highestPaid);
    }
}
