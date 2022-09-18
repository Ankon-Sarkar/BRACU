import java.util.Scanner;
public class Task1{
  public static void main(String [] args){
    Scanner sin=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sin.nextInt();
   System.out.println( fact(a));
  }
 public static int fact(int n){
    if(n==1 || n==0)
      return 1;
    else
     return n*fact(n-1);
    
 }
}
                         