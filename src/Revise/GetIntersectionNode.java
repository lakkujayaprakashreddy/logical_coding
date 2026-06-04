package Revise;

public class GetIntersectionNode {
    public static ListNode getInterSectionNode(ListNode headA,ListNode headB){
        while(headA!=headB){
            headA=(headA==null)?headB:headA.next;
            headB=(headB==null)?headA:headB.next;
        }
        return headA;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);

        ListNode l2=new ListNode(9);
        l2.next=new ListNode(4);
        l2.next.next=new ListNode(5);

        ListNode result=getInterSectionNode(l1,l2);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
