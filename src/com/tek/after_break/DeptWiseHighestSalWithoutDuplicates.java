package com.tek.after_break;

import com.tek.streams.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employeee{
    String name;
    String department;
    double salary;
    public Employeee(String name,String department,double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class DeptWiseHighestSalWithoutDuplicates {
    public static void main(String[] args) {
        List<Employeee> employees= Arrays.asList(
                new Employeee("Jane", "HR", 60000),
                new Employeee("Doe", "IT", 55000),
                new Employeee("Smith", "HR", 65000),
                new Employeee("Emily", "Finance", 70000));

        Map<String, Optional<Employeee>> result=employees.stream()
                    .distinct()
                    .collect(Collectors.groupingBy(Employeee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employeee::getSalary))));
        System.out.println(result);

//        Map<String,List<Employeee>> collect = employees.stream()
//                .collect(Collectors.groupingBy(Employeee::getDepartment), TreeMap::new, Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().sorted(Comparator.comparingDouble(Employeee::getSalary).reversed())));
    }
}
