/*
 * ************Question********************
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

							For example:
							Given binary tree [3,9,20,null,null,15,7],
							    3
							   / \
							  9  20
							    /  \
							   15   7
							return its level order traversal as:
							[
							  [3],
							  [9,20],
							  [15,7]
							]
************Solution********************

Intuition behind solution: 
	Create a queue and add the root to the queue. 
	While the queue is not empty process all the nodes in the queue. 
	At every iteration of the queue not being empty, get the size of the queue (this represents 
			however many nodes are on the current level of the tree). 
	Iterate through all these nodes with a for loop, adding their values to a "current level" list. 
	After adding their value to the list, check if they have left and right children adding them to the queue is they do exist (
			this allows us to process the next level of the tree on the next iteration of our while loop). 
	Once our for loop terminates we have populated a list of all the nodes' 
	values on the current level and we add this list to our return value (a list of lists). 
			Once our while loop ends we have processed all the levels of the true and therefore return our result (our list of lists).
					
					
					*/
					


package Programs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
}

public class BST {

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> currentLevel = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.remove();
				currentLevel.add(current.val);
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
			result.add(currentLevel);
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(levelOrder(root));
	}
}
