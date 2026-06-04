package com.tek.random;

import java.util.Comparator;
import java.util.TreeSet;
import com.tek.random.Student;

class ageComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        if(s1.age>s2.age){
            return 1;
        }else if(s1.age<s2.age){
            return -1;
        }else{
            return 0;
        }
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<Student>(new ageComparator().reversed());
        students.add(new Student("John","123",20));
        students.add(new Student("Alice","124",22));
        students.add(new Student("Bob","125",19));
        for(Student s:students){
            System.out.println(s.name+" "+s.id+" "+s.age);
        }
    }
}
