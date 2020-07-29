/*
 * LeetCode 206. Reverse Linked List
 * 
 * Time Complexity: O(n) 1 pass
 * Space Complexity: O(1) 
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 * 
 */




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
    public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}