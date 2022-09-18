public class Main{
  public static void main (String [] args){
    Object []a={10,20,30,40};
    Linkedlist l=new Linkedlist(a);
    printreverse(l.head);
  }
  public static void printreverse(Node h){
    Node i=h;
    if(i!=null){

    printreverse(i.next);
    System.out.println(i.elem);
  }
}
}