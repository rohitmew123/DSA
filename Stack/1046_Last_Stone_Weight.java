/*
LeetCode 1046 - Last Stone Weight

Problem:
Given an array of stones, repeatedly smash the two heaviest stones.
If their weights are different, add the difference back.
Return the weight of the remaining stone, or 0 if no stone remains.

Approach:
1. Use a Max Heap using PriorityQueue.
2. Add all stones to the PriorityQueue.
3. Remove the two heaviest stones.
4. Calculate their difference.
5. If the difference is not zero, add it back to the PriorityQueue.
6. Continue until at most one stone remains.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones) {
            pq.add(ele);
        }

        while(pq.size() > 1) {
            int max = pq.remove();
            int maxtwo = pq.remove();

            int calc = max - maxtwo;

            if(calc != 0) {
                pq.add(calc);
            }
        }

        if(pq.size() == 0) {
            return 0;
        }
        else {
            return pq.remove();
        }
        
    }
}
