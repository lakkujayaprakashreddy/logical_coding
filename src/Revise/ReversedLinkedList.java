package Revise;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class ReversedLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(5);
        ListNode reverse=reverseLinkedList(head);
        while(reverse!=null){
            System.out.println(reverse.val);
            reverse=reverse.next;
        }
    }
    public static ListNode reverseLinkedList(ListNode l1){
        ListNode prev=null;
        ListNode current=l1;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
