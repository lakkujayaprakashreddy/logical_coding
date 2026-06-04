package com.tek.dsa.LinkedList;

public class RemoveNthNodeLinkedList {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        ListNode result=removeNthNodeLinkedList(l1,2);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode removeNthNodeLinkedList(ListNode l1,int n){
        ListNode slow=l1;
        ListNode fast=l1;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return l1;
    }
}
