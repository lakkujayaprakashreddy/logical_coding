package com.tek.dsa.LinkedList;

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        ListNode common=new ListNode(4);
        common.next=new ListNode(5);

        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=common;

        ListNode l2=new ListNode(9);
        l2.next=common;

        ListNode result=intersectionOfTwoLinkedList(l1,l2);

        while(result!=null){
            System.out.println(result.val);
            result=result.next;

        }
    }
    public static ListNode intersectionOfTwoLinkedList(ListNode l1,ListNode l2){

        ListNode p1=l1;
        ListNode p2=l2;
        while(p1!=p2){
            p1=(p1==null)?l2:p1.next;
            p2=(p2==null)?l1:p2.next;
        }
        return p1;
    }
}