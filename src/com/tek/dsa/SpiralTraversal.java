package com.tek.dsa;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> result=spiralTraversal(matrix);
        System.out.println(result);
    }
    public static List<Integer> spiralTraversal(int[][] matrix){
        List<Integer> result=new ArrayList<>();
        int left=0;
        int right= matrix.length-1;
        int top=0;
        int bottom=matrix[0].length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<=right && top<=bottom) {
                for (int i=bottom;i>=top;i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
