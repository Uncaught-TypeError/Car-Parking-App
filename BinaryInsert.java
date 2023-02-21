package Assignment;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryInsert {

    static class Node {

        String key;
        Node left;
        Node right;

        Node(String key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;

    static void Inorder(Node temp) {
        if (temp == null) {
            return;
        }
        Inorder(temp.left);
        System.out.print(temp.key + ", ");
        Inorder(temp.right);
    }

    static void insert(Node temp, String key) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }
    }

    // Driver code 
    public static void main(String args[]) {
        root = new Node("*");
        root.left = new Node("+");
        root.left.left = new Node("a");
        root.left.right = new Node("b");
        root.right = new Node("-");
        root.right.left = new Node("c");
        root.right.right = new Node("d");

        System.out.print("Inorder traversal before insertion:");
        Inorder(root);

        String key = "Waka";
        insert(root, key);

        System.out.print("\nInorder traversal after insertion:");
        Inorder(root);
    }
}
