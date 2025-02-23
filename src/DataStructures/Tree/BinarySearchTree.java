package DataStructures.Tree;

public class BinarySearchTree {
    Node root;

    // Insert Node
    Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    // Search in BST
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    // Inorder Traversal (Sorted Order)
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);  // Output: 20 30 40 50 60 70 80

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));  // Output: true
        System.out.println("Search 90: " + tree.search(tree.root, 90));  // Output: false
    }
}

