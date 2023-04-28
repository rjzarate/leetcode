/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

  The left subtree of a node contains only nodes with keys less than the node's key.
  The right subtree of a node contains only nodes with keys greater than the node's key.
  Both the left and right subtrees must also be binary search trees.
  
https://leetcode.com/problems/validate-binary-search-tree/
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> previousNodes = new Stack<TreeNode>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        while (root != null || !previousNodes.isEmpty()) {
            if (root != null) {
                previousNodes.add(root);
                root = root.left;
            }

            if (root == null && !previousNodes.isEmpty()) {
                root = previousNodes.pop();
                values.add(root.val);
                root = root.right;
            }
        }
        /*
        for (int num: values) {
            System.out.println(num);
        }
        */
        for (int i = 1; i < values.size(); i ++) {
            if (values.get(i - 1) >= values.get(i))
                return false;
        }

        return true;
    }
}
