//package innovationM.faq;
//import com.tek.dsa.LinkedList.ListNode;
//public class ReorderingLinkedList {
//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        reorderLinkedList(head);
//        printList(head);
//    }
//    public static void printList(ListNode head) {
//
//        while (head != null) {
//
//            System.out.print(head.val + " ");
//
//            head = head.next;
//        }
//    }
//    public static void reorderLinkedList(ListNode l1){
//        if(l1==null || l1.next==null){
//            return;
//        }
//        ListNode slow=l1;
//        ListNode fast=l1;
//        while(fast.next!=null && fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        ListNode second=slow.next;
//        slow.next=null;
//        ListNode previous=null;
//        while(second!=null){
//            ListNode next=second.next;
//            second.next=previous;
//            previous=second;
//            second=next;
//        }
//        ListNode first=l1;
//        second=previous;
//        while(second!=null){
//            ListNode temp1=first.next;
//            ListNode temp2=second.next;
//            first.next=second;
//            second.next=temp1;
//            first=temp1;
//            second=temp2;
//        }
//    }
//}
