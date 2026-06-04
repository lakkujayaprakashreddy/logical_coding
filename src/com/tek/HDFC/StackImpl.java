package com.tek.HDFC;

public class StackImpl {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
class Stack{
    private int capacity;
    private int top;
    private int[] stack;
    public Stack(int size){
        this.capacity=size;
        this.top=-1;
        this.stack=new int[size];
    }
    public void push(int x){
        if(capacity-1==top){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=x;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        return stack[top];
    }
}
