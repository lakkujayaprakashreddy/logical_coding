package Revise;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 7, 9, 12, 15, 17, 21, 24};
        int target=17;
        if (binarySearch(arr,target)!=-1){
            System.out.println("The index of target number using Binary Search is :"+binarySearch(arr,target));
        }else{
            System.out.println("Not found");
        }
    }
    public static int binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
