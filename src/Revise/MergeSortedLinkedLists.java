package Revise;

public class MergeSortedLinkedLists {

    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        if(l1!=null){
            tail.next=l1;
        }else{
            tail.next=l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(3);
        l1.next.next=new ListNode(5);
        l1.next.next.next=new ListNode(7);

        ListNode l2=new ListNode(2);
        l2.next=new ListNode(4);
        l2.next.next=new ListNode(6);
        l2.next.next.next=new ListNode(8);
        l2.next.next.next.next=new ListNode(9);
        l2.next.next.next.next.next=new ListNode(10);

        ListNode result=merge(l1,l2);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
