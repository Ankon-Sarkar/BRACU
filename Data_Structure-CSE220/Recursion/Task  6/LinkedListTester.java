public class LinkedListTester{
  public static void main(String [] args){
    
    Object [] a1 = {10,20,30,40};
    LinkedList h = new LinkedList(a1);
    System.out.println(sum(h.head));
  }
  public static int sum(Node head){
    Node h=head;
    if(h!=null){
      return (int)h.element + sum(h.next);
    }
    else
      return 0;
  }
}