package Assignment;

public class BinaryTree {

    public static Node root;

    public void Preorder(Node a) {
        if (a != null) {
            System.out.print(a.data+" ");
            Preorder(a.left);
            Preorder(a.right);
        }

    }

    public void Inorder(Node a) {
        if (a != null) {
            Inorder(a.left);
            System.out.print(a.data+" ");
            Inorder(a.right);
        }

    }

    public void Postorder(Node a) {
        if (a != null) {
            System.out.print(a.data+" ");
            Postorder(a.left);
            Postorder(a.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree N = new BinaryTree();
        root = new Node("*");
        root.left = new Node("+");
        root.left.left = new Node("a");
        root.left.right = new Node("b");
        root.right = new Node("-");
        root.right.left = new Node("c");
        root.right.right = new Node("d");
        System.out.print("Post Order: ");
        N.Postorder(root);
        System.out.print("\nIn Order: ");
        N.Inorder(root);
        System.out.print("\nPre Order: ");
        N.Preorder(root);
    }

}
