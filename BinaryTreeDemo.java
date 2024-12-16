class BinaryTree {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.add(current.right);
            }
        }
    }

    // Inorder Traversal (Left, Root, Right)
    public void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Preorder Traversal (Root, Left, Right)
    public void preorderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Postorder Traversal (Left, Right, Root)
    public void postorderTraversal(Node node) {
        if (node == null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    // Level Order Traversal
    public void levelOrderTraversal() {
        if (root == null) return;

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }

    public boolean search(int data) {
        if (root == null) return false;

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.data == data) {
                return true;
            }

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return false;
    }

    // Find height of the tree
    public int findHeight(Node node) {
        if (node == null) return 0;

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);

        System.out.print("Inorder Traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorderTraversal(tree.root);
        System.out.println();

        System.out.print("Level Order Traversal: ");
        tree.levelOrderTraversal();

        System.out.println("Search 30: " + tree.search(30));
        System.out.println("Search 100: " + tree.search(100));

        System.out.println("Height of Tree: " + tree.findHeight(tree.root));
    }
}
