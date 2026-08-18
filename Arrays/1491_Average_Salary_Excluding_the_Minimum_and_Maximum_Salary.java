/*
LeetCode 1491 - Average Salary Excluding the Minimum and Maximum Salary

Problem:
Given an array of unique salaries, return the average salary
excluding the minimum and maximum salary.

Approach:
1. Initialize min, max, and sum with the first salary.
2. Traverse the remaining salaries.
3. Find the minimum and maximum salary.
4. Calculate the total sum of all salaries.
5. Subtract the minimum and maximum salary from the total sum.
6. Divide the remaining sum by the number of remaining salaries.

Formula:
(sum - min - max) / (salary.length - 2)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public double average(int[] salary) {

        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];
        
        for(int i=1; i<salary.length; i++) {
            
            if(max < salary[i]) {
                max = salary[i];
            }
            if(min > salary[i]) {
                min = salary[i];
            }

            sum = sum + salary[i];
        
        }
        sum = sum - min - max;
        double ans = (double)sum / (salary.length-2);
        return ans;
        
    }
}
