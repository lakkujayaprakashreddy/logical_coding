package com.tek.programs;

import java.util.Arrays;
import java.util.List;

public class PalindomeInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "hello", "noon");
        for(String word:words){
            if(isPalindome(word)){
                System.out.println(word);
            }
        }
    }

    private static boolean isPalindome(String word) {
        String reverse=new StringBuffer(word).reverse().toString();
        return word.equals(reverse);
    }
}
