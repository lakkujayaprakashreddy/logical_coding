package com.tek.random;

import java.util.TreeSet;


class Student implements Comparable<Student>{
    String name;
    String id;
    int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    @Override
    public int compareTo(Student s){
        return this.age-s.age;
    }


}
public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<Student>();
        students.add(new Student("John","123",20));
        students.add(new Student("Alice","124",22));
        students.add(new Student("Bob","125",19));
        for(Student s:students){
            System.out.println(s.name+" "+s.id+" "+s.age);
        }
    }
}
