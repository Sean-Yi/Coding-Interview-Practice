package difficulty.medium;

import entities.TreeNode;

public class Validate_Binary_Search_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isValidBST(TreeNode root) {
        
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, int leftVal, int rightVal) {
        if(root == null) return true;
        
        if(root.val < rightVal && root.val > leftVal) {
            return  isValidBST(root.left, leftVal, root.val) && isValidBST(root.right, root.val, rightVal);   
        } else {
            return false;
        }

    }

}
