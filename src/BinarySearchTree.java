//Create Class Node
    class Node{
        int data;
        Node left;
        Node right;
        //Constructor
        public Node(int data) {
        this.data = data;
        }
    }
public class BinarySearchTree {
        Node root;
        //Method to add Node to BST
         public void add (int data){
         root = addToNode(root,data);
    }
    //Method addNode
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
    //Method inOrder to Traversal the Nodes in BST
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
        System.out.println("Welcome to Binary Search Tree");
        //Object
        BinarySearchTree tree = new BinarySearchTree();
        //Adding nodes to BST
        tree.add(56);
        tree.add(30);
        tree.add(70);
        tree.add(22);
        tree.add(40);
        tree.add(60);
        tree.add(95);
        tree.add(11);
        tree.add(65);
        tree.add(3);
        tree.add(16);
        tree.add(63);
        tree.add(67);
        tree.inOrder();
    }
}
