package binarytree;

public class BinarySearchTreeDeletion {

	TreeNode5 root;

	    // Constructor
	    public BinarySearchTreeDeletion() {
	        root = null;
	    }

	    // Function to insert a node in the tree
	    public void insert(int val) {
	        root = insertRecursive(root, val);
	    }

	    // Recursive function to insert nodes in the tree
	    private TreeNode5 insertRecursive(TreeNode5 root, int val) {
	        if (root == null) {
	            root = new TreeNode5(val);
	            return root;
	        }

	        if (val < root.val) {
	            root.left = insertRecursive(root.left, val);
	        } else if (val > root.val) {
	            root.right = insertRecursive(root.right, val);
	        }

	        return root;
	    }

	    // Function to delete a node in the tree
	    public void delete(int val) {
	        root = deleteRecursive(root, val);
	    }

	    // Recursive function to delete a node in the tree
	    private TreeNode5 deleteRecursive(TreeNode5 root, int val) {
	        if (root == null) {
	            return root;
	        }

	        if (val < root.val) {
	            root.left = deleteRecursive(root.left, val);
	        } else if (val > root.val) {
	            root.right = deleteRecursive(root.right, val);
	        } else {
	            // Node to be deleted found

	            // Node with only one child or no child
	            if (root.left == null)
	                return root.right;
	            else if (root.right == null)
	                return root.left;

	            // Node with two children: Get the inorder successor (smallest in the right subtree)
	            root.val = minValue(root.right);

	            // Delete the inorder successor
	            root.right = deleteRecursive(root.right, root.val);
	        }

	        return root;
	    }

	    // Function to find the minimum value in a subtree
	    private int minValue(TreeNode5 root) {
	        int minValue = root.val;
	        while (root.left != null) {
	            minValue = root.left.val;
	            root = root.left;
	        }
	        return minValue;
	    }

	    // Function to print the tree in inorder traversal
	    public void printInorder() {
	        System.out.print("In-order traversal: ");
	        inOrderRecursive(root);
	        System.out.println();
	    }

	    // Recursive function to perform inorder traversal
	    private void inOrderRecursive(TreeNode5 root) {
	        if (root != null) {
	            inOrderRecursive(root.left);
	            System.out.print(root.val + " ");
	            inOrderRecursive(root.right);
	        }
	    }
	}

	