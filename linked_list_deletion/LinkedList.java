class LinkedList{
  Node head;

  class Node{
    int data;
    Node next;
    Node(int d){
      data = d;
      next = null;
    }
  }
  public static void main(String[] args) {
    LinkedList llist = new LinkedList();
    llist.push(7);
  //  llist.printList();
    llist.push(7);
    //llist.printList();
    llist.push(1);
    llist.printList();
    llist.push(3);
    llist.push(4);

    System.out.println("\nCreated Linked List is:");
    llist.printList();
    llist.deleteNode(1);
    System.out.println("\nLinked List after deletion at pos 4");
    llist.printList();
  }

  public void push(int new_data){
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  public void printList(){
    Node tnode = head;
    do{
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }while(tnode.next != null);
  }

  void deleteNode(int key){
    Node temp = head, prev = null;
    if (temp != null && temp.data == key) {
      head = temp.next;
      return;
    }

    while(temp !=null && temp.data !=key){
      prev= temp;
      temp = temp.next;
    }
    if (temp == null) {
      return;
    }
    prev.next = temp.next; //Unlink the Node from the LinkedList
  }
}
