import java.util.Queue;
import java.util.LinkedList;
class Node{
  int data;
  Node left, right;

  public Node(int item){
    data = item;
    left= null;
    right = null;
  }
}

class BinaryTree{
  Node root;
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    System.out.println("Level order traversal of Binary tree is ");
    tree.printLevelOrder();
  }

  void printLevelOrder(){
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node tempNode = queue.poll();
      System.out.print(tempNode.data + " ");
      if (tempNode.left != null) {
        queue.add(tempNode.left);
      }
      if (tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }
  }
}
