// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
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
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode slow = dummy;
    // Maintaining n node difference between fast node and slow node.
    for(int i = 0; i<=n; i++) {
      fast = fast.next;
    }
    while(fast!=null) {
      slow = slow.next;
      fast = fast.next;
    }
    // Removing the node next to slow.
    slow.next=slow.next.next;
    return dummy.next;
  }
}