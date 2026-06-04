package com.tek.dsa_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap {
        int capacity;
        public LRUCache(int capacity){
            super(capacity,0.75f,true);
            this.capacity=capacity;
        }
        @Override
        protected boolean removeEldestEntry(Map.Entry entry){
            return size()>capacity;
        }
}
