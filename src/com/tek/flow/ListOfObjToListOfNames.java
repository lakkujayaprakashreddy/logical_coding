package com.tek.flow;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String dept;
    private double salary;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class ListOfObjToListOfNames {
    public static void main(String[] args) {
        List<Employee> employees=List.of(
                new Employee("John","IT",50000),
                new Employee("Jane","HR",60000),
                new Employee("Doe","Finance",55000)
        );
        List<String> lst_of_names=employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(lst_of_names);

        Map<String, List<Employee>> grouped_Emp_By_Dept=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(grouped_Emp_By_Dept);

        Optional<Employee> highest_sal_Emp=employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(highest_sal_Emp);

        LinkedHashMap<String, String> collect = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getDept, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
