package com.tek.dsa.LinkedList;

public class LinkedListAddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(3);
        l1.next.next=new ListNode(5);
        l1.next.next.next=new ListNode(7);
        l1.next.next.next.next=new ListNode(9);

        ListNode l2=new ListNode(2);
        l2.next=new ListNode(4);
        l2.next.next=new ListNode(6);
        l2.next.next.next=new ListNode(8);
        l2.next.next.next.next=new ListNode(10);

        ListNode result=addTwoNumbers(l1,l2);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }

    }
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        int carry=0;
        while(l1!=null|| l2!=null || carry!=0 ){
            int sum= carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
        }
        return dummy.next;
    }
}
