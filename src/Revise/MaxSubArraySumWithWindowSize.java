package Revise;

public class MaxSubArraySumWithWindowSize {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k=3;
        int current_Sum=0;
        int max_Sum=0;
        for(int i=0;i<k;i++){
            current_Sum+=arr[i];
            max_Sum=Math.max(current_Sum, max_Sum);
        }
        for(int i=k;i<arr.length;i++){
            current_Sum=-arr[i-k]+current_Sum+arr[i];
            max_Sum=Math.max(current_Sum,max_Sum);
        }
        System.out.println(max_Sum);
    }
}
