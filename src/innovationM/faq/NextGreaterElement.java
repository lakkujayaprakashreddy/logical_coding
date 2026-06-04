package innovationM.faq;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr={4, 5, 2, 10};
        int[] result=nextGreaterElement(arr);
        System.out.println(java.util.Arrays.toString(result));
    }
    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=0;
            }else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
