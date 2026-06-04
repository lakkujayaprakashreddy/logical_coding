package innovationM.faq;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImpl {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
        Thread t1=new Thread(()->{
            map.put(1,"One");
            map.put(2,"Two");
        });
        Thread t2=new Thread(()->{
            map.put(3,"Three");
            map.put(4,"Four");
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ConcurrentHashMap Contents: "+map);
        System.out.println(map.get(1));
    }
}
