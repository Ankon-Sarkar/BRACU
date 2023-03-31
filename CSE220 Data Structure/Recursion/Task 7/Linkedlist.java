public class Linkedlist{
  Node head;
  public Linkedlist(Object []a){
    Node n1=new Node(a[0],null);
    head =n1;
    for(int i=1;i<a.length;i++){
      Node n2=new Node(a[i],null);
      n1.next=n2;
      n1=n2;
    }
  }
}