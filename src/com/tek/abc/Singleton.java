package com.tek.abc;

public class Singleton {
    private Singleton(){

    }
    public static class SingletonHelper{
        public static final Singleton instance=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHelper.instance;
    }
}
