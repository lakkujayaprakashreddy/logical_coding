package com.tek.GeekyAnts;
import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String,List<String>> result=Arrays.stream(strs)
                .collect(Collectors.groupingBy(GroupAnagram::isAnagram));
        System.out.println(result.values());
    }
    public static String isAnagram(String input){
        char[] charArr=input.toCharArray();
        Arrays.sort(charArr);
        String result=new String(charArr);
        return result;
    }
}
