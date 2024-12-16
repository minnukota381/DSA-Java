import java.util.Scanner;

class BinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node createTree(Scanner sc) {
        System.out.println("Enter data (-1 for no node):");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node newNode = new Node(data);

        System.out.println("Enter left child of " + data + ":");
        newNode.left = createTree(sc);

        System.out.println("Enter right child of " + data + ":");
        newNode.right = createTree(sc);

        return newNode;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " --> ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " --> ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " --> ");
    }
}

public class BinaryTreeDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("Creating the binary tree:");
        BinaryTree.Node root = tree.createTree(sc);

        System.out.println("\nPreorder Traversal:");
        tree.preorder(root);

        System.out.println("\nInorder Traversal:");
        tree.inorder(root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(root);

        sc.close();
    }
}
