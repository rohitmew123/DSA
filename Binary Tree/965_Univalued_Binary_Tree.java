/*
 * LeetCode 965 - Univalued Binary Tree
 *
 * Approach:
 * Use recursion to check whether every node has the
 * same value as the root node.
 *
 * The root value is passed as the reference value.
 * If any node has a different value, return false.
 * Both left and right subtrees must also be univalued.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 * where h is the height of the binary tree.
 */

class Solution {
    public boolean helper(TreeNode root, int val) {
        if(root == null) {
            return true;
        }

        if(root.val != val) {
            return false;
        }

        boolean leftans = helper(root.left, val);
        boolean rightans = helper(root.right, val);

        return leftans && rightans;
    }

    public boolean isUnivalTree(TreeNode root) {
        return helper(root, root.val);
    }
}
