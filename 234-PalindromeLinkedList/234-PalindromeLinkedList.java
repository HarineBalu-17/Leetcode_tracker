// Last updated: 7/14/2026, 2:14:54 PM
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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode s=head,f=head,r=null;
        while(f!=null&& f.next!=null){
            ListNode temp=s;
            s=s.next;
            f=f.next.next;
            temp.next=r;
            r=temp;
        }
        if(f!=null)s=s.next;
        while(s!=null&&s.val==r.val){
            s=s.next;
            r=r.next;
        }
        return s==null;
        
    }
}
