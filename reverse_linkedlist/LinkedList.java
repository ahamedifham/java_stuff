class LinkedList{
  static Node head;

  static class Node{
    int data;
    Node next;
    Node(int d){
      data = d;
      next= null;
    }
  }

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();
    llist.head = new Node(85);
    llist.head.next = new Node(15);
    llist.head.next.next = new Node(4);
    llist.head.next.next.next = new Node(20);
    System.out.println("Given Linked List");
    llist.printList(head);
    head = llist.reverse(head);
    System.out.println(" ");
    System.out.println("Reversed Linked List");
    llist.printList(head);
  }

  void printList(Node node){
    while (node !=null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }

  Node reverse(Node node){
    Node prev = null;
    Node current = node;
    Node next = null;
    while(current !=null){
      next = current.next;
      current.next= prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }
}
