package Programs;

/*class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}*/

	public class SortedArrayToBST {

		private static TreeNode sortedArrayToBST(int[] nums) {
			if (nums == null || nums.length == 0) {
				return null;
			}
			return constructRecursiveBST(nums, 0, nums.length - 1);
		}

		public static TreeNode constructRecursiveBST(int[] nums, int left, int right) {
			if (left > right) {
				return null;
			}
			int mid = left + (right - left) / 2;
			TreeNode current = new TreeNode(nums[mid]);
			current.left = constructRecursiveBST(nums, left, mid - 1);
			current.right = constructRecursiveBST(nums, mid + 1, right);
			return current;
		}
		 private static void traverseTree(TreeNode root) {
		        if (root != null) {
		            traverseTree(root.left);
		            traverseTree(root.right);
		            System.out.println(root.val);
		        }
		    }

		public static void main(String[] args) {
			int[] nums = { 2, 4, 5, 1, 6 };
			TreeNode root = sortedArrayToBST(nums);
			traverseTree(root);
		}		
	}

