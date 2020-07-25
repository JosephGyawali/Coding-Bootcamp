/*
 * LeetCode 709. To Lower Case
 * 
 * Time Complexity: O(n) 1 pass
 * Space Complexity: O(n) Stringbuilder
 * 
 * https://leetcode.com/problems/to-lower-case/
 * 
 * 
 */



class Solution {
    public String toLowerCase(String str) {
        StringBuilder solution = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            int ascii = (int) c;
            if( (ascii > 96) && (ascii < 123) ){
                solution.append(c);
            }
            else if((ascii > 64) && (ascii <91)) {
                int lowerCaseAscii = ascii +32;
                char lowerCase = ((char) lowerCaseAscii);
                solution.append(lowerCase);
            }
            else{
                char random = ((char)ascii);
                solution.append(random);
            }
        }
        return solution.toString();
    }
}