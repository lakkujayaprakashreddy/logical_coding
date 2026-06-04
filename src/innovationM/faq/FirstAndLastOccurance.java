package innovationM.faq;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] nums = {5,7,7,9,9,9,9,9,10};
        int target = 9;
        int firstOccurance=findPosition(nums,target,true);
        int lastOccurance=findPosition(nums,target,false);
        System.out.println("First Occurance of "+target+" is at index "+firstOccurance);
        System.out.println("Last Occurance of "+target+" is at index "+lastOccurance);
    }
    public static int findPosition(int[] arr,int target,boolean isFirst){
        int left=0;
        int right=arr.length;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                if(isFirst){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            } else if (arr[mid]>target) {
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }
}
