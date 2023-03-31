public class Lab2{
    
////////////////////Tester part started////////////////////////////
  public static void main(String [] args){
    int [] a = {10, 20, 30, 40, 50, 60};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    b=reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 }
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    
     System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateRight(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
   
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,90);
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
      
  }
  
  
  public static void printArray(int [] source){
    // TO DO
    for(int i=0;i<source.length;i++){
     System.out.print( source[i]+" "); 
    }
    System.out.println();
  }
    
   public static int [] copyArray(int [] source, int len){
   int [] a=new int[len];
   for(int i=0;i<a.length;i++){
     a[i]=source[i];
   }
    return a;  
  }
   public static void printReverse(int [] source){
     for(int i=source.length-1;i>=0;i--){
       System.out.print(source[i]+" ");
  }
     System.out.println();
}
    
 public static  int[] reverseArray(int[] source) {
       int i=0;
       int j=source.length-1;
        while (i < j){
            System.out.println("*****");
            int temp=source[i];
            source[i]=source[j];
            source[j]=temp;
            i++;
            j--;
        }
        return source;
    }
    
    public static int [] shiftLeft(int [] source, int k){
      for(int i=1;i<=k;i++){
        for(int j=0;j<source.length-1;j++){
          source[j]=source[j+1];
        }
        source[source.length-1]=0;
      }
    return source;     
  }
    
    public static int [] rotateLeft(int [] source, int k){
      for(int i=1;i<=k;i++){
        int temp=source[0];
         for(int j=0;j<source.length-1;j++){
           source[j]=source[j+1];
         }
         source[source.length-1]=temp;
      }
    return source;    
  }
    
    public static int [] shiftRight(int [] source, int k){
      for(int i=1;i<=k;i++){
        for(int j=source.length-1;j>0;j--){
          source[j]=source[j-1];
        }
        source[0]=0;
      }
    return source;     
  }
    
     public static int [] rotateRight(int [] source, int k){
       for(int i=1;i<=k;i++){
    int temp=source[source.length-1];
    for(int j=source.length-1;j>0;j--){
      source[j]=source[j-1];
    }
    source[0]=temp;
     }
    return source; // remove this line    
  }
     
     public static boolean insert(int [] arr, int size, int elem, int index){
        if(size<arr.length){
          if(index==size){
            arr[index]=elem;
            size++;
            System.out.println("Number of element after insertion "+size);
          }
          else {
            for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
            }
            arr[index]= elem;
            size++;
            System.out.println("Number of element after insertion "+size);
          }
   return true; 
  }
       System.out.println("No space left");
       return false; 
     }
     
     public static boolean removeAll(int [] arr, int size, int elem){
       int c=0;
       for(int i=0;i<arr.length;i++){
         if(elem==arr[i]){
           c++;
           int k=i;
             for(int j=k;j<arr.length-1;j++){
               arr[j]=arr[j+1];
             }
             arr[arr.length-1]=0;
         }
       }
       if(c>0){
         return true;
       }
    return false;     
  }
}
 
  
  
