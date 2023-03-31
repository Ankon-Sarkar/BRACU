import java.util.Scanner;
public class Quiz1{
  public static void main (String [] args){
    int a[]={1,6,2,3,10} ;
     Scanner sin=new Scanner(System.in);
    int n=sin.nextInt();
    try{
      if (n<0 || n>a.length){
        throw new  Myexception();
      }
       
        for(int i=1;i<=n;i++){
      int temp=a[a.length-1];
      for(int j=a.length-1;j>0;j--){
        a[j]=a[j-1];
      }
      a[0]=temp;
    }
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
  }
      }
    
    
    catch(Exception e){
      System.out.println("Not possible to rotate right");
    }
   
  }
}
    
    