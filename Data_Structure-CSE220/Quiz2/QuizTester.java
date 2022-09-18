public class QuizTester{
  public static void main(String[]args){
    
    int[]a={12,13,14,15,16};
    
    Node n1 = new Node(3,null);
    Node n2 = new Node(8,null);
    Node n3 = new Node(-3,null);
    Node n4 = new Node(2,null);
    Node n5 = new Node(88,null);
    Node n6 = new Node(3,null);
    
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = null;
    
    Quiz q = new Quiz();
   System.out.println(q.countEven(n1)); // Output: 3
    q.printReverse(a,0); // Output: 16,15,14,13,12
    //q.dec2bin(18); // 10010
  }
}