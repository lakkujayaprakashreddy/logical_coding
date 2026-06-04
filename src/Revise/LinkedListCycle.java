package Revise;

import java.util.List;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode l1){
        if(l1==null || l1.next==null){
            return false;
        }
        ListNode slow=l1;
        ListNode fast=l1;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
