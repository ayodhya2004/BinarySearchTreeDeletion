package binarytree;

public class BinarySearchTreeDeletionMain {

	public static void main(String[] args) {
		BinarySearchTreeDeletion tree = new BinarySearchTreeDeletion();

		        // Inserting the nodes to form the given BST
		        tree.insert(8);
		        tree.insert(3);
		        tree.insert(10);
		        tree.insert(1);
		        tree.insert(6);
		        tree.insert(14);
		        tree.insert(4);
		        tree.insert(7);
		        tree.insert(13);

		        // Printing the in-order traversal of the tree before deletion
		        System.out.println("Before deletion:");
		        tree.printInorder();

		        // Deleting the node with value 6
		        tree.delete(6);

		        // Printing the in-order traversal of the tree after deletion
		        System.out.println("After deletion:");
		        tree.printInorder();
		    }
	
}