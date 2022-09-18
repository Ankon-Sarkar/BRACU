public class Task3{
  public static void main(String [] args){
    int []a={10,20,30,40};
    printarray(a,0);
  }
  public static void   printarray(int []a,int i){
    if(i<a.length){
      System.out.println(a[i]);
      printarray(a,i+1);
    }
  }
}