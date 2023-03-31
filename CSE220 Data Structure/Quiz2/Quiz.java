public class Quiz{
  
  /* count the number of even numbers found in the singly linked list
   * @param: head of the linked list
   */
  public int countEven(Node h){
   
    if(h!=null){
    
    
   if(h.item%2==0)
    return 1+countEven(h.next);
   else 
     return countEven(h.next);
    }
    
    
     
   
      //change this line
  
   else
     return 0;
  }
    

  
  /* Print the numbers inside the array in a reverse manner 
   * @param: reference of the array and the initial index
   */
  public void printReverse(int[]a, int i){
    if(i<a.length){
     printReverse(a,i+1);
     System.out.println(a[i]);
  }
  }
  
  /* Convert the given decimal number to binary and print
   * @param: decimal number to be converted to binary
   */
  public void dec2bin(int n){
    if(n==1){
      System.out.print(n);
    }
    int q=n/2;
    int r=n%2;
    dec2bin(n);
    System.out.print(r);
    
  }
}