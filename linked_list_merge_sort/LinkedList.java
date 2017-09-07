public class LinkedList{
  Node head;

  static class Node{
    int data;
    Node next;

    public Node(int d){
      this.data = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedList llist =  new LinkedList();

    llist.push(15);
    llist.push(10);
    llist.push(5);
    llist.push(20);
    llist.push(3);
    llist.push(2);

    System.out.println("Linked List without sorting is ");
    llist.printList(llist.head);

    llist.head = llist.mergeSort(llist.head);
    System.out.print("\n Sorted Linked List is \n");
    llist.printList(llist.head);
  }

  void printList(Node headref){
    while (headref != null) {
      System.out.print(headref.data + "->");
      headref = headref.next;
    }
    System.out.print("Null");
  }

  void push(int new_data){
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  Node mergeSort(Node h){
    if (h == null || h.next == null) {
      return h;
    }
    Node middle = getMiddle(h);
    Node nextOfMiddle = middle.next;

    middle.next = null;
    Node left = mergeSort(h);
    Node right = mergeSort(nextOfMiddle);

    Node sortedList = sortedMerge(left, right);
    return sortedList;
  }

  Node getMiddle(Node h){
    if (h==null) {
      return h;
    }
    Node fastptr = h.next;
    Node slowptr = h;

    while(fastptr != null){
      fastptr = fastptr.next;
      if (fastptr !=null) {
        slowptr = slowptr.next;
        fastptr = fastptr.next;
      }
    }
    return slowptr;
  }

  Node sortedMerge(Node a, Node b){
    Node result = null;
    if (a ==null) {
      return b;
    }
    if (b == null) {
      return a;
    }

    if (a.data <= b.data) {
      result = a;
      result.next = sortedMerge(a.next, b);
    }else {
      result = b;
      result.next = sortedMerge(a, b.next);
    }
    return result;
  }
}
