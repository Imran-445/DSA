class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null){
            return list2;
        }

        if(list2==null){
            return list1;
        }
        
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        ListNode head = null;
        ListNode temp = null;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val < ptr2.val) {
                if (head == null) {
                    head = ptr1;
                    temp = ptr1;
                } else {
                    temp.next = ptr1;
                    temp = temp.next;
                }
                ptr1 = ptr1.next;
            } else {
                if (head == null) {
                    head = ptr2;
                    temp = ptr2;
                } else {
                    temp.next = ptr2;
                    temp = temp.next;
                }
                ptr2 = ptr2.next;
            }
        }


        if(ptr1!=null){
            temp.next=ptr1;
        }else{
            temp.next=ptr2;
        }

        return head;
    }
}