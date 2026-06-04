package Revise;

public class ReorderLinkedList {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        reOrder(l1);
        while(l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
    public static void reOrder(ListNode l1){
        if(l1==null || l1.next==null) return;
        ListNode slow=l1;
        System.out.println("initial slow="+slow.val);
        ListNode fast=l1;
        System.out.println("initial fast="+fast.val);
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            System.out.println("while iteration slow="+slow.val);
            fast=fast.next.next;
            System.out.println("while iteration fast=" + (fast != null ? fast.val : "null"));
        }
        System.out.println("while loop completed");
        ListNode current=slow.next;
        System.out.println("Assigning slow.next value to current current="+current.val);
        ListNode previous=null;
        slow.next=null;
        while(current!=null){
            ListNode next=current.next;
            System.out.println("reverse while iteration next=" + (next != null ? next.val : "null"));
            current.next=previous;
            System.out.println("reverse while iteration current=" + (current.next != null ? current.next.val : "null"));
            previous=current;
            System.out.println("reverse while iteration previous="+previous.val);
            current=next;
            System.out.println("reverse while iteration current=" + (current != null ? current.val : "null"));

            System.out.println("one iteration complted--------------");
        }
        ListNode first=l1;
        System.out.println("assigning l1 value to first:"+first.val);
        ListNode second=previous;
        System.out.println("assigning previous value to second:"+second.val);
        while(second!=null){
            ListNode temp1=first.next;
            System.out.println("second while temp1=" + (temp1 != null ? temp1.val : "null"));
            first.next=second;
            System.out.println("second while first.next="+second.val);
            first=temp1;
            System.out.println("second while first="+first.val);
            ListNode temp2=second.next;
            System.out.println("second while temp2=" + (temp2 != null ? temp2.val : "null"));
            second.next=first;
            System.out.println("second while second.next="+second.next.val);
            second=temp2;
            System.out.println("second while second=" + (second != null ? second.val : "null"));
            System.out.println("-------------");
        }
    }
}
