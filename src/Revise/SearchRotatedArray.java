package Revise;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,1,2,3};
        int target = 2;

        System.out.println(search(nums, target)); // Output: 5
    }
    public static int search(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[left]<=arr[mid]){
                if(arr[mid]>target && arr[left]<=target ){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }else{
                if(arr[mid]<target && arr[right]>=target){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
