package com.tek.HDFC;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String input="programming";
        int[] freq=new int[26];
        for(char ch:input.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0) {
                System.out.println((char) (i + 'a') + "-" + freq[i]);
            }
        }
    }
}
