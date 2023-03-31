public class Tester{
  public static void main(String[]args){
    
    int [] cir = {40,50,10,20,30};
    
    LabFinal lb = new LabFinal(cir,2,5);
    lb.pop(); // output: 10
   System.out.println( lb.search(10,lb.head)); // output: false
    System.out.println(lb.search(20,lb.head)); // output: true
    lb.enqueue(-20);
    lb.toArray();
    lb.printSorted(); // output: -20 20 30 40 50
  }
}