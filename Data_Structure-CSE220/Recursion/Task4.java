import java.util.Scanner;
public class Task4{
  public static void main(String [] args){
    Scanner sin=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sin.nextInt();
    decTobin(a);
  }
    public static void decTobin(int n){
      if(n==1)
       System.out.print(1); 
      else{
      int q=n/2;
      int r=n%2;
      decTobin(q);
      System.out.print(r);
    }
    }
}