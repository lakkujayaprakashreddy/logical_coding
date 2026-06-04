package com.tek.flow;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        a.add();

        B b=new B();
        b.add();

        A a1=new B();
        a1.add();
    }
}
class A{
    public void add(){
        System.out.println("add() in class A");
    }
}
class B extends A{
    @Override
    public void add() {
        System.out.println("add() in class B");
    }
}
