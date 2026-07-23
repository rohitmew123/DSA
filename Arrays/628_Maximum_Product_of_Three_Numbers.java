/*
LeetCode 628 - Maximum Product of Three Numbers

Approach:
1. Sort the array in ascending order.
2. Calculate the product of the three largest numbers.
3. Calculate the product of the two smallest numbers and the largest number.
4. Return the maximum of the two products.

Reason:
The product of two negative numbers is positive, so the maximum product
can come from either:
- Three largest numbers
- Two smallest (most negative) numbers and the largest number

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int largest = nums[n-1];
        int secondlargest = nums[n-2];
        int thirdlargest = nums[n-3];

        int smallest = nums[0];
        int secondsmallest = nums[1];

        int product1 = largest * secondlargest * thirdlargest;
        int product2 = smallest * secondsmallest * largest;

        if(product1 >= product2) {
            return product1;
        } else {
            return product2;

        }
        
    }
}
