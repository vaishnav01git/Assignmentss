package Collection_Q10;

public class BinaryTree10 {

	static Node10 root;

	Node10 sortedArrayToBST(int arr[], int start, int end) {

		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		Node10 node = new Node10(arr[mid]);

		node.left = sortedArrayToBST(arr, start, mid - 1);

		node.right = sortedArrayToBST(arr, mid + 1, end);

		return node;
	}

	void preOrder(Node10 node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void main(String[] args) {
		BinaryTree10 tree = new BinaryTree10();
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		root = tree.sortedArrayToBST(arr, 0, n - 1);
		System.out.println("Preorder traversal of constructed BST");
		tree.preOrder(root);
	}
}
