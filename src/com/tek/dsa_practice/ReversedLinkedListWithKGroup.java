package com.tek.dsa_practice;

import java.awt.*;

public class ReversedLinkedListWithKGroup {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        l1.next.next.next.next.next=new ListNode(6);
        int k=2;
        ListNode result=reverseLinkedListWithKGrouop(l1,k);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;

        }
    }
    public static ListNode reverseLinkedListWithKGrouop(ListNode head,int k){
        ListNode current=head;
        int count=0;
        while(current!=null && count<k){
            current=current.next;
            count++;
        }
        if(k==count){
            current=reverseLinkedListWithKGrouop(current,k);
//            while(count-- > 0){
//                ListNode temp=head.next;
//                head.next=current;
//                current=head;
//                head=temp;
//            }
//                head= current;
            reverse(current,head,count,k);

        }
        return head;
    }
    public static ListNode reverse(ListNode current,ListNode head,int count, int k){
        ListNode reverse=null;
        while(count-->0){
            ListNode next=current.next;
            current.next=reverse;
            reverse=current;
            current=next;
        }
        return reverse;
    }

}


//public static ListNode reverseLinkedListWithKGrouop(ListNode head,int k){
//
//    ListNode current = head;
//    int count = 0;
//
//    while(current != null && count < k){
//        current = current.next;
//        count++;
//    }
//
//    if(count == k){
//
//        ListNode nextGroup = reverseLinkedListWithKGrouop(current, k);
//
//        ListNode newHead = reverseKNodes(head, k);
//
//        head.next = nextGroup;
//
//        return newHead;
//    }
//
//    return head;
//}
//
//public static ListNode reverseKNodes(ListNode head, int k){
//
//    ListNode prev = null;
//    ListNode curr = head;
//
//    while(k-- > 0){
//        ListNode next = curr.next;
//        curr.next = prev;
//        prev = curr;
//        curr = next;
//    }
//
//    return prev;
//}
