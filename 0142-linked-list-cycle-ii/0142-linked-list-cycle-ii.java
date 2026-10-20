/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                ListNode temp = slow;
                int length = 0;


                do{
                temp=temp.next;
                length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }


   public ListNode detectCycle (ListNode head) {
      int length=0;
      ListNode fast = head;
      ListNode slow = head;

      while(fast!=null && fast.next!=null) {
         fast = fast.next.next;
         slow = slow.next;

         if (slow == fast) {
            length = lengthCycle(slow);
            break;
         }
      }
      
      if(length==0) {
         return null;
      }
      
      ListNode ptr1 = head;      
      ListNode ptr2 = head;
      
      while(length>0){
         ptr2=ptr2.next;
         length--;
      }
      
      while(ptr1!=ptr2){
         ptr1=ptr1.next;
         ptr2=ptr2.next;
      }
      return ptr1;
    }
}