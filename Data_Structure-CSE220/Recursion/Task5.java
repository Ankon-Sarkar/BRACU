import java.util.Scanner;
public class Task5{
  public static void main(String [] args){
     Scanner sin=new Scanner(System.in);
    System.out.println("Enter a number");
    int m=sin.nextInt();
    System.out.println("Enter power");
    int n=sin.nextInt();
    System.out.println(power(m,n));
  }
  public static int  power(int m,int n){
    if(n==0)
      return 1;
    else
      return m*power(m,n-1);
  }
}