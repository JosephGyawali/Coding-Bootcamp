/*
 * LeetCode 217. Contains Duplicate
 * 
 * Time Complexity: O(n^2) worst case 2 passes
 * Space Complexity: O(n) hashmap
 * 
 * https://leetcode.com/problems/fizz-buzz/
 * 
 * 
 */




class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], (hm.get(nums[i]))+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        
        for(int i = 0; i<nums.length; i++){
            if(hm.get(nums[i]) >1){
                return true;
            }
        }
        
        return false;
    }
}