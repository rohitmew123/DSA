/*
LeetCode 319 - Bulb Switcher

Problem:
There are n bulbs initially turned off. In each round,
certain bulbs are toggled. After n rounds, return the
number of bulbs that remain ON.

Approach:
Only bulbs at perfect square positions remain ON.
So, count how many perfect squares are less than or equal to n.

Example:
n = 10

Perfect squares:
1, 4, 9

Total ON bulbs = 3

Time Complexity: O(sqrt(n))
Space Complexity: O(1)
*/

class Solution {
    public int bulbSwitch(int n) {

        int count = 0;

        int i = 1;

        while(i * i <= n) {
            count++;
            i++;
        }
        return count;
        
    }
}
