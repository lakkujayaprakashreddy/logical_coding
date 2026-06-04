package com.tek.GeekyAnts;

public class CommonSuffix {
    public static void main(String[] args) {
        String[] strs={"flower","floight","floor"};
        String suffix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(suffix)){
                suffix=suffix.substring(0,suffix.length()-1);
                if(suffix.isEmpty()){
                    System.out.println("no common suffix found");
                }
            }
        }
        System.out.println("Longest common suffix is "+suffix);
    }
}
