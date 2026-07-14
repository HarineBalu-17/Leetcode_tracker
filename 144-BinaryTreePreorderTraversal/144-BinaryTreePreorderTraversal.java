// Last updated: 7/14/2026, 2:15:13 PM
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
    List<Integer>ll=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            ll.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return ll;
        
        
    }
}