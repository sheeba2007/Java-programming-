class Node {
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinarySearchTreedelete{
    Node root;
    
    void delete(int data) {
        root = deleteNode(root, data);
    }
    
    Node deleteNode(Node currentNode, int data) {
        // Base case: If the tree is empty
        if (currentNode == null) {
            return currentNode;
        }

        // Recur down the tree to find the node to be deleted
        if (data < currentNode.data) {
            currentNode.left = deleteNode(currentNode.left, data);
        } else if (data > currentNode.data) {
            currentNode.right = deleteNode(currentNode.right, data);
        } else {
            // Node to be deleted found

            // Case 1: Node has no children (leaf node)
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }

            // Case 2: Node has only one child
            if (currentNode.left == null) {
                return currentNode.right;
            } else if (currentNode.right == null) {
                return currentNode.left;
            }

            // Case 3: Node has two children
            // Get the in-order successor (smallest node in the right subtree)
            currentNode.data = minValue(currentNode.right);

            // Delete the in-order successor
            currentNode.right = deleteNode(currentNode.right, currentNode.data);
        }
        return currentNode;
    }

    // Helper function to find the minimum value node in a tree
    int minValue(Node node) {
        int minValue = node.data;
        while (node.left != null) {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }

    // Print the tree in-order (left-root-right)
    void printTree() {
        printTree(root);
        System.out.println();
    }

    void printTree(Node node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.data + " ");
            printTree(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreedelete bst = new BinarySearchTreedelete();
        bst.root = new Node(50);
        bst.root.left = new Node(30);
        bst.root.right = new Node(70);
        bst.root.right.left = new Node(20);
        bst.root.left.right = new Node(40);

        System.out.println("Before deletion:");
        bst.printTree();
        
        bst.delete(70); // Deleting node with value 70
        System.out.println("After deletion:");
        bst.printTree();
    }
}
