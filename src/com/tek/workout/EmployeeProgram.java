package com.tek.workout;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String department;
    private String jobTitle;
    private LocalDate doj;
    private int age;
    private int yearsOfExperience;
    private double salary;
    private int performanceRating;

    public Employee(String name,
                    String department,
                    String jobTitle,
                    LocalDate doj,
                    int age,
                    int yearsOfExperience,
                    double salary,
                    int performanceRating) {

        this.name = name;
        this.department = department;
        this.jobTitle = jobTitle;
        this.doj = doj;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.performanceRating = performanceRating;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", doj=" + doj +
                ", age=" + age +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                ", performanceRating=" + performanceRating +
                '}';
    }
}
public class EmployeeProgram {
    public static void main(String[] args) {

        List<Employee> employees = List.of(

                new Employee("Rohit", "IT", "Senior Developer",
                        LocalDate.of(2018, 3, 14),
                        32, 9, 125000, 5),

                new Employee("Anjali", "HR", "HR Manager",
                        LocalDate.of(2015, 7, 21),
                        37, 12, 110000, 4),

                new Employee("Kiran", "Finance", "Financial Analyst",
                        LocalDate.of(2020, 1, 10),
                        29, 5, 85000, 4),

                new Employee("Meghana", "Marketing", "Marketing Manager",
                        LocalDate.of(2016, 11, 5),
                        35, 10, 130000, 5),

                new Employee("Vikas", "Operations", "Operations Executive",
                        LocalDate.of(2022, 6, 18),
                        27, 3, 65000, 3),

                new Employee("Sneha", "Sales", "Sales Manager",
                        LocalDate.of(2014, 4, 25),
                        40, 15, 150000, 5),

                new Employee("Arjun", "IT", "DevOps Engineer",
                        LocalDate.of(2019, 9, 12),
                        30, 6, 95000, 4),

                new Employee("Pooja", "Finance", "Accounts Manager",
                        LocalDate.of(2013, 8, 30),
                        38, 14, 140000, 5),

                new Employee("Rahul", "Marketing", "Content Strategist",
                        LocalDate.of(2021, 2, 17),
                        28, 4, 78000, 3),

                new Employee("Divya", "IT", "Manager",
                        LocalDate.of(2014, 12, 3),
                        42, 18, 180000, 5),
                new Employee("Ritu", "Finance", "Finance Manager",
                        LocalDate.of(2024, 3, 10),
                        36, 8, 135000, 5)

        );



//        List<Employee> empAsMgrSal1LJoinLast3yrs=employees
//                .stream()
//                .filter(employee->employee.getJobTitle().toLowerCase().contains("manager") && employee.getDoj().isAfter(LocalDate.of(2026,02,18).minusYears(3)) && employee.getSalary()>100000)
//                .collect(Collectors.toList());
//        System.out.println(empAsMgrSal1LJoinLast3yrs);
//
//        System.out.println("---------------------------------");
//        List<Employee> remainingEmployees=employees.stream().filter(employee -> !empAsMgrSal1LJoinLast3yrs.contains(employee)).sorted(Comparator.comparingInt(Employee::getYearsOfExperience).reversed().thenComparingInt(Employee::getPerformanceRating))
//                .collect(Collectors.toList());
//        System.out.println(remainingEmployees);
//
//        System.out.println("---------------------------------");
//        List<String> remainingEmployeesNames=employees.stream()
//                .filter(employee -> !empAsMgrSal1LJoinLast3yrs.contains(employee))
//                .map(employee -> {
//                    return new StringBuilder(employee.getName().toUpperCase()).reverse().toString();
//                }).collect(Collectors.toList());
//        System.out.println(remainingEmployeesNames);
//
//        System.out.println("=========================================");
        List<Employee> firstCondition=employees
                .stream()
                .filter(employee -> employee.getDoj().isAfter(LocalDate.now().minusYears(5))&& employee.getPerformanceRating()<8&& employee.getSalary()>60000 && employee.getSalary()<120000)
                .collect(Collectors.toList());
        System.out.println(firstCondition);
        List<Employee> secondCondition=employees
                .stream()
                .filter(employee -> !firstCondition.contains(employee))
                .sorted(Comparator.comparingDouble(Employee::getSalary).thenComparingInt(Employee::getYearsOfExperience).reversed())
                .collect(Collectors.toList());
        System.out.println(secondCondition);
        System.out.println("----------------------------------");
        List<Integer> secondConditionNames=employees
                .stream()
                .map(employee -> employee.getAge()*10)
                .collect(Collectors.toList());
        System.out.println(secondConditionNames);
    }
}
