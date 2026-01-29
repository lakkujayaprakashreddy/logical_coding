package com.tek.programs;

import java.util.*;

public class RandomizedSet {
  private Map<Integer, Integer> map;
  private List<Integer> list;
  private Random random;
  public RandomizedSet(){
      map=new HashMap<>();
      list=new ArrayList<>();
      random=new Random();
  }
  public boolean insert(int val){
      if(map.containsKey(val)) return false;
      map.put(val, list.size());
      list.add(val);
      return true;
  }
  public boolean remove(int val){
      if(!map.containsKey(val)) return  false;
      int index=map.get(val);
      int lastElement=list.get(list.size()-1);
      list.set(index,lastElement);
      map.put(lastElement, index);
      list.remove(list.size()-1);
      map.remove(val);
      return  true;
  }
  public int getRandom(){
      int randomIndex=random.nextInt(list.size());
      return list.get(randomIndex);
  }
}
