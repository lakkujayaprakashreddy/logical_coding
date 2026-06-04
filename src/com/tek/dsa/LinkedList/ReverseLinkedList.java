package com.tek.dsa.LinkedList;
  class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);

        ListNode result=reverse(l1);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode reverse(ListNode l1){
        ListNode current=l1;
        ListNode previous=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}
