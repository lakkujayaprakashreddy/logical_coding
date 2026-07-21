package com.tek.dsa_practice;
import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String,List<String>> result=createGroupAnagram(strs);
        System.out.println(result.values());
    }
    public static Map<String,List<String>> createGroupAnagram(String[] strs){
        Map<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            int[] freq=new int[26];
            for(char ch:word.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int num:freq){
                sb.append(num).append("#");
            }
            map.computeIfAbsent(sb.toString(),k->new ArrayList<>()).add(word);
        }
        return map;
    }
}
