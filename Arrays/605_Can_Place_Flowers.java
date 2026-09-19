/*
 * LeetCode 605 - Can Place Flowers
 *
 * Approach:
 * Traverse the flowerbed from left to right.
 * A flower can be planted at index i if:
 * - Current position is empty.
 * - Left position is empty or i is the first position.
 * - Right position is empty or i is the last position.
 *
 * After planting, mark the position as 1 and decrease n.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int l = flowerbed.length;

        if(n == 0) {
            return true;
        }

        for(int i = 0; i < l; i++) {

            if(flowerbed[i] == 0) {

                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == l - 1) || (flowerbed[i + 1] == 0);

                if(left && right) {

                    flowerbed[i] = 1;
                    n--;

                    if(n == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
