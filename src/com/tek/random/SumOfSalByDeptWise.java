package com.tek.random;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}


public class SumOfSalByDeptWise {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 40000),
                new Employee("Charlie", "IT", 70000),
                new Employee("David", "HR", 50000),
                new Employee("Eve", "Finance", 80000)
        );
        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(collect);
    }




}
