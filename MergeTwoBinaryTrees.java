package Programs;

class Node {
	int data;
	Node left, right;

	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class MergeTwoBinaryTrees {
	int data;
	Node left, right;

	/*
	 * public void Node(int data, Node left, Node right) { this.data = data;
	 * this.left = left; this.right = right; }
	 */

	static Node newNode(int data) {
		return new Node(data, null, null);
	}

	void inorder(Node node) {
		if (node == null)
			return;

		inorder(node.left);
		inorder(node.right);
		System.out.printf("%d", node.data);
	}

	Node MergeTrees(Node t1, Node t2) {
		if (t1 == null)
			return t2;

		if (t2 == null)
			return t1;

		t1.data += t2.data;
		t1.left = MergeTrees(t1.left, t2.left);
		t1.right = MergeTrees(t1.right, t2.right);
		return t1;
	}
}