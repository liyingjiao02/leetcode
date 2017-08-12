/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	
  public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length-1);
    }
  
  public TreeNode build(int [] nums, int start, int end){
	  if(start > end) return null;
	  int max = nums[start]; int pos = start;
	  for(int i = start+1;  i <= end; i++){
		  if(nums[i] > max){
			  max = nums[i];
			  pos = i;
		  }
	  }
	  TreeNode root = new TreeNode(max);
	  root.left = build(nums, start, pos-1);
	  root.right = build(nums, pos+1, end);
	  return root;
  }

}
