package Revise;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                System.out.println(stack.pop()+"->"+arr[i]);
            }
            stack.add(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop()+"->"+-1);
        }
    }
}
