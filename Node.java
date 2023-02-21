package Assignment;

public class Node {

    String data;
    Node left;
    Node right;

    public Node(String data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(String data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void Preorder(Node a) {
        if (a != null) {
            System.out.println(a.data);
            Preorder(a.left);
            Preorder(a.right);
        }
    }

    public void Inorder(Node a) {
        if (a != null) {
            Inorder(a.left);
            System.out.println(a.data);
            Inorder(a.right);
        }
    }

    public void Postorder(Node a) {
        if (a != null) {
            System.out.println(a.data);
            Postorder(a.left);
            Postorder(a.right);
        }
    }
}
