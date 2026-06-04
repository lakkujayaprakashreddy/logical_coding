package Revise;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean result=canJump(nums);
        System.out.println(result);
    }
    public static boolean canJump(int[] arr){
        int farthest=0;
        for(int i=0;i<arr.length;i++){
            if(i>farthest) {
                return false;
            }
            farthest=Math.max(farthest,i+arr[i]);
        }
        return true;
    }
}
