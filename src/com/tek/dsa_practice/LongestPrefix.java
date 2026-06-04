package com.tek.dsa_practice;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println("No common prefix found");
                    return;
                }
            }
        }
        System.out.println("Longest common prefix is "+prefix);
    }
}
