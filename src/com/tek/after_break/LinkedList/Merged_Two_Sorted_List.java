package com.tek.after_break.LinkedList;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class Merged_Two_Sorted_List {
    public static void main(String[] args) {
        ListNode l1= new ListNode(0);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(6);

        ListNode l2= new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(5);
        l2.next.next.next=new ListNode(7);

        ListNode result=mergeTwoLinkedList(l1,l2);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode mergeTwoLinkedList(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                current.next=l2;
                l2=l2.next;
            }else {
                current.next=l1;
                l1=l1.next;
            }
            current=current.next;
        }
        if(l1!=null){
            current.next=l1;
        }else {
            current.next=l2;
        }
        return dummy.next;
    }
}
