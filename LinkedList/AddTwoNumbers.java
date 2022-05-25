/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
    2 -> 4
    1 -> 2
   ________
    3 -> 6
   ________
   
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode resHead = new ListNode(0);
        ListNode res = resHead;
        
        int carry=0,sum=0,val1=0,val2=0;
        
        while(l1!=null || l2!=null)
        {
            val1 = (l1 != null) ? l1.val : 0;
            val2 = (l2 != null) ? l2.val : 0;
            sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            
            res.next = new ListNode(sum);
            if(l1 != null) l1=l1.next;
            if(l2 != null) l2=l2.next;
            res = res.next;
        }
        
        if(carry != 0)
            res.next = new ListNode(carry);
        
        return resHead.next;
    }
}
