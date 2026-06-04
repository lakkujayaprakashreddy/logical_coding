package com.tek.abc;

public class FreqUsingStringInbuiltMethods {
    public static void main(String[] args) {
        String input="Programming";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(input.indexOf(ch)==i){
                int count=input.length()-input.replace(String.valueOf(ch),"").length();
                System.out.println(ch+" : "+count);
            }
        }
    }
}
