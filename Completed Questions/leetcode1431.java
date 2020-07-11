

/*
 * LeetCode 1431: Kids With the Greatest Number of Candies
 * 
 * Time Complexity: O(n^2) iterated twice one to get max and one to input list elements
 * Space Complexity: O(n) arraylist
 * 
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * 
 * 
 */



class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> solution = new ArrayList<>();
        
        int max = candies[0];
        for(int i = 1; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }// end of for loop and have max
        
        for(int i = 0; i<candies.length; i++){
            if(candies[i]+extraCandies > max || candies[i]+extraCandies == max){
                solution.add(true);
            }
            else{
                solution.add(false);
            }
        }
        
        return solution;
    }
}