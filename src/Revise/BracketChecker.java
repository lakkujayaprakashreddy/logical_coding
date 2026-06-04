package Revise;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BracketChecker {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String:");
        String input=scn.nextLine();
        if(isBracketChecker(input)){
            System.out.println("Balanced");
        }else {
            System.out.println("Not balanced");
        }
    }
    public static boolean isBracketChecker(String input){
        Queue<Character> heap=new PriorityQueue<>();
        for(char ch:input.toCharArray()){
            if(ch=='{'||ch=='['||ch=='('){
                heap.add(ch);
            }else{
                if(heap.isEmpty()) return false;
                char minHeap=heap.peek();
                if(minHeap=='{' && ch!='}' || minHeap=='[' && ch!=']' || minHeap=='(' && ch!=')'){
                    return false;
                }else{
                    heap.poll();
                }
            }
        }
        return heap.isEmpty();
    }
}
