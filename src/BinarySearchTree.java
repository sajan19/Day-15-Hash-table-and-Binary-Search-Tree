
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
public class BinarySearchTree {
    Node root;
    public void add (int data){
        root = addToNode(root,data);
    }

    private Node addToNode(Node root, int data) {
        if (root == null){
            root = new Node(data);
            return root;
        }
        if (data < root.data){
            root.left = addToNode(root.left,data);
        }else if(data > root.data){
            root.right = addToNode(root.right,data);
        }
        return root;
    }

    public void inOrder(){
        if (root != null){
            System.out.print("InOrder Traversal: ");
        }
        inOrderByNode(root);
        System.out.println();
    }

    private void inOrderByNode(Node root) {
        if (root != null){
            inOrderByNode(root.left);
            System.out.print(root.data+ " ");
            inOrderByNode(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(20);
        tree.add(30);
        tree.add(10);
        tree.inOrder();
    }
}
