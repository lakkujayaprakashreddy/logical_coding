package Revise;

import com.tek.streams.Employee;

import java.util.*;
import java.util.stream.Collectors;

class Employeee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employeee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class EmpMaxSalInEachDept {
    public static void main(String[] args) {
        List<Employeee> employees = Arrays.asList(
                new Employeee(1, "Om Namah Shivaya", 100000, "Kailasam"),
                new Employeee(2, "Om Namo Venkaatesaya", 150000, "Vaikuntam"),
                new Employeee(3, "Om Namo Brahmaya", 150000, "BrahmaLokam"),
                new Employeee(4, "Om Krishnaya Namaha", 50000, "Vaikuntam"),
                new Employeee(5, "Om Vigneashwaraya Namaha", 200000, "Kailasam"),
                new Employeee(6, "Om Naradhaya Namaha", 40000, "BrahmaLokam")
                );
        Map<String, Optional<Employeee>> result=employees.stream()
                .collect(Collectors.groupingBy(
                        Employeee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employeee::getSalary))
                ));
        System.out.println(result);

        Map<String,Double> result2=employees.stream()
                .collect(Collectors.groupingBy(Employeee::getDepartment,Collectors.averagingDouble(Employeee::getSalary)));
        System.out.println(result2);
    }
}
