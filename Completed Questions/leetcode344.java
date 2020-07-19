/*
 * LeetCode 344: Reverse String
 * 
 * Time Complexity: O(n/2) = O(n) iterate through half of input array
 * Space Complexity: O(1) created no auxillary space
 * 
 * https://leetcode.com/problems/reverse-string/
 * 
 * 
 */


class Solution {
    public void reverseString(char[] s) {
        int backptr = s.length-1;
        for(int i = 0; i<(s.length+1)/2; i++){
            char temp = s[i];
            s[i] = s[backptr];
            s[backptr] = temp;
            backptr--;
        }
    }
}