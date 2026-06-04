package com.tek.after_break;

import com.tek.after_break.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode l1=new ListNode(0);
        l1.next=new ListNode(1);
        l1.next.next=new ListNode(2);
        l1.next.next.next=new ListNode(3);
        l1.next.next.next.next=new ListNode(4);
        l1.next.next.next.next.next=new ListNode(5);
        ListNode result=reverseLinkedList(l1);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode reverseLinkedList(ListNode head){
        ListNode previous=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}
