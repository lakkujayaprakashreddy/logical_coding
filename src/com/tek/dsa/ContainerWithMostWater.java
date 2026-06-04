package com.tek.dsa;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        int h=0;
        int w=0;
        while(left<right){
            h=Math.min(height[left],height[right]);
            w=right-left;
            int area=h*w;
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
