package Revise;

public class ReverseLinkedListKGroup {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next= new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        l1.next.next.next.next.next=new ListNode(6);
        l1.next.next.next.next.next.next=new ListNode(7);
        ListNode head=l1;
        while(head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println();
        int po=2;
        ListNode he=reverse(l1,po);
        while(he!=null){
            System.out.print(he.val+"->");
            he=he.next;
        }


    }
    public static ListNode reverse(ListNode head,int po){
        ListNode curr=head;
        int co=0;

        while(curr!=null && co<po){
            curr=curr.next;
            co++;
        }
        if(co==po){
            curr=reverse(curr,co);

            while(co-- >0){
                ListNode temp=head.next;
                head.next=curr;
                curr=head;
                head=temp;
            }
            head=curr;


        }

        return head;
    }

}
