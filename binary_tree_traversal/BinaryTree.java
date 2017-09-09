class BinaryTree{
  Node root;

  static class Node{
    int key;
    Node left,right;
    public Node(int item){
      key = item;
      left = right = null;
    }
  }

  BinaryTree(){
    root =null;
  }
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    System.out.println("Pre order traversal of Binary tree is ");
    tree.printPreorder();
    System.out.println("\nInorder traversal of Binary tree is ");
    tree.printInorder();
    System.out.println("\nPostorder traversal of Binary Tree is ");
    tree.printPostorder();
  }

  void printPreorder(){printPreorder(root);}
  void printInorder(){printInorder(root);}
  void printPostorder(){printPostorder(root);}

  void printPreorder(Node node){
    if (node == null) {
      return;
    }
    System.out.print(node.key + " ");
    printPreorder(node.left);
    printPreorder(node.right);
  }

  void printInorder(Node node){
    if (node == null) {
      return;
    }
    printInorder(node.left);
    System.out.print(node.key + " ");
    printInorder(node.right);
  }

  void printPostorder(Node node){
    if (node == null) {
      return;
    }
    printPostorder(node.left);
    printPostorder(node.right);
    System.out.print(node.key + " ");
  }

}
