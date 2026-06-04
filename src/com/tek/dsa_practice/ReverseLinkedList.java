package com.tek.dsa_practice;


public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode l1=new ListNode(7);
        l1.next=new ListNode(8);
        l1.next.next=new ListNode(8);

        ListNode reversedList=reverse(l1);

        while(reversedList!=null){
            System.out.println(reversedList.val);
            reversedList=reversedList.next;
        }
    }
    public static ListNode reverse(ListNode l1){
        ListNode prev=null;
        ListNode current=l1;
        ListNode next=null;

        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
