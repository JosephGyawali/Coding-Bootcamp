/*
387. First Unique Character in a String
https://leetcode.com/problems/first-unique-character-in-a-string/
Time Complexity: O(n^2) Iterate twice. Once to populate the hashmap. Second to return the first key that == 1
Space Complexity: (n +n) = O(n) Array and Hashmap
*/


class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i = 0; i<c.length; i++){
            if(hm.containsKey(c[i])){
                hm.put(c[i], (hm.get(c[i])+1));
            }
            else{
                hm.put(c[i],1);
            }
        }// populated hashmap
        
        for(int i = 0; i<c.length; i++){
            if(hm.get(c[i]) == 1){
                return i;
            }
        }
        
        return -1;
    }
}

