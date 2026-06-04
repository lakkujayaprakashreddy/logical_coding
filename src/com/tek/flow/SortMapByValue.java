package com.tek.flow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Manoj",50000);
        map.put("Amit",40000);
        map.put("Rahul",60000);
        map.put("John",45000);
        Map<String,Integer> sortedMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}
