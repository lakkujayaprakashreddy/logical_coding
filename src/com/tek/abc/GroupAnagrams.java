package com.tek.abc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
            String[] strs={"eat","tea","tan","ate","nat","bat"};
            java.util.Map<String, List<String>> result=Arrays.stream(strs)
                    .collect(Collectors.groupingBy(GroupAnagrams::isAnagram));
            System.out.println(result.values());
    }
    public static String isAnagram(String strs){
        char[] charArr=strs.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
