/*
LeetCode 1189 - Maximum Number of Balloons

Approach:
1. Count frequency of characters b, a, l, o, n.
2. Since 'l' and 'o' appear twice in "balloon",
   divide their frequencies by 2.
3. The answer is the minimum count among
   b, a, l, o, n.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxNumberOfBalloons(String text) {

            int b = 0;
            int a = 0; 
            int l = 0;
            int o = 0;
            int n = 0;

        for(int i=0; i<text.length(); i++) {
           
            char ch = text.charAt(i);

            if(ch == 'b') {
                b++;
            } 
            else if(ch == 'a') {
                a++;
            }
            else if(ch == 'l') {
                l++;
            } 
            else if(ch == 'o') {
                o++;
            } 
            else if(ch == 'n') {
                n++;
            }    
        
        }
      
        l = l/2;
        o = o/2;
        int ans =Math.min(b,a);
        ans = Math.min(ans, l);
        ans = Math.min(ans,o);
        ans = Math.min(ans,n);
       
        return ans;
        
    }
}
