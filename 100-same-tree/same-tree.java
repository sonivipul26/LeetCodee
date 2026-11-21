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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        preorderP(p,list1);
        preorderQ(q,list2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
    public void preorderP(TreeNode root,ArrayList<Integer> list1){
        if(root==null){
            list1.add(null);
            return;
        }
        list1.add(root.val);
        preorderP(root.left,list1);
        preorderP(root.right,list1);
    }
    public void preorderQ(TreeNode root,ArrayList<Integer> list2){
        if(root==null){
            list2.add(null);
            return;
        }
        list2.add(root.val);
        preorderQ(root.left,list2);
        preorderQ(root.right,list2);
    }
}