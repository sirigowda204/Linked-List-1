// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
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
  public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    boolean hasCycle = false;

    // Checking if the linked list has a cycle.
    while(fast!=null && fast.next!=null) {
      fast = fast.next.next; // Moves 2x
      slow = slow.next; // moves 1x
      if(fast == slow) {
        hasCycle = true;
        break;
      }
    }

    if(!hasCycle) return null;

    // Setting fast back to head after the two pointers meet.
    fast = head;
    // Moving both pointers at the same speed until they meet again.
    while(slow!=fast) {
      fast = fast.next;
      slow = slow.next;
    }

    return fast;
  }
}