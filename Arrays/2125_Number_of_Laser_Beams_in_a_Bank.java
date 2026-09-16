/*
 * LeetCode 2125 - Number of Laser Beams in a Bank
 *
 * Approach:
 * Count the number of security devices ('1') in each row.
 * For every non-empty row, calculate:
 *
 *     previous row devices × current row devices
 *
 * Empty rows are ignored, so prevDevice is updated only
 * when the current row contains at least one device.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1) extra space
 */

class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;

        int prevDevice = 0;
        int result = 0;

        for(int i = 0; i < n; i++) {
            int currDevice = 0;

            for(char ch : bank[i].toCharArray()) {
                if(ch == '1') {
                    currDevice++;
                }
            }

            result = result + (currDevice * prevDevice);

            if(currDevice != 0) {
                prevDevice = currDevice;
            }
        }

        return result;
    }
}
