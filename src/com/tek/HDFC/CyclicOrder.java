package com.tek.HDFC;

public class CyclicOrder {
    public static boolean rotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String s3=s1+s1;
        if(s3.contains(s2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="abcde";
        String s2="deabc";
        System.out.println(rotation(s1,s2));
    }
}
