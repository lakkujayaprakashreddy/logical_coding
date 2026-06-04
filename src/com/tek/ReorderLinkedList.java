package com.tek;

class ListNode{
    ListNode next;
    int val;

    public ListNode(int val){
        this.val = val;
    }
}

public class ReorderLinkedList {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        reorder(l1);

        while(l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    public static void reorder(ListNode l1){

        if(l1 == null || l1.next == null){
            return;
        }

        ListNode slow = l1;
        ListNode fast = l1;

        // 1️⃣ Find middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2️⃣ Reverse second half
        ListNode current = slow.next;
        slow.next = null;

        ListNode previous = null;

        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        // 3️⃣ Merge lists
        ListNode first = l1;
        ListNode second = previous;

        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;

        }
    }
}