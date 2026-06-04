package com.tek.dsa.LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode l1=new ListNode(3);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(0);
        l1.next.next.next=new ListNode(-4);
//        l1.next.next.next.next=new ListNode(9);

        boolean result=hasCycle(l1);
        if(result){
            System.out.println("Has Cycle");
        }else{
            System.out.println("Has Not Cycle");

        }    }
    public static boolean hasCycle(ListNode l1){
        if(l1==null || l1.next==null) return false;
        ListNode slow=l1;
        ListNode fast=l1;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
