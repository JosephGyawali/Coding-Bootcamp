/*
 * LeetCode 412. Fizz Buzz
 * 
 * Time Complexity: O(n) 1 pass
 * Space Complexity: O(n) arraylist
 * 
 * https://leetcode.com/problems/fizz-buzz/
 * 
 * 
 */


class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(i%3 == 0 && i%5==0){
                al.add("FizzBuzz");
            }
            else if(i%3==0){
                al.add("Fizz");
            }
            else if(i%5==0){
                al.add("Buzz");
            }
            else{
                al.add(""+i+"");
            }
        } // end of populating arraylist
        
        return al;
    }
}