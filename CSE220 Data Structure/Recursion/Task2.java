import java.util.Scanner;
public class Task2{
  public static void main(String [] args){
    Scanner sin=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sin.nextInt();
    System.out.println (fib(a));
  }
  public static int fib(int n){
    if(n==0)
      return 0;
    else if(n==1)
      return 1;
      
    else
      return fib(n-1)+fib(n-2);
  }
}