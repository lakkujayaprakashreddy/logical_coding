package Revise;

public class JumpGameAlt {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int result=canJump(nums);
        System.out.println(result);
    }
    public static int canJump(int[] arr){
        int farthest=0;
        int jumps=0;
        int currentEnd=0;
        for(int i=0;i<arr.length-1;i++){
            farthest=Math.max(farthest,i+arr[i]);
            if(i==currentEnd){
                jumps++;
                currentEnd=farthest;
            }
        }
        return jumps;
    }
}
