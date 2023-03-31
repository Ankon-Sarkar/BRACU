public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    //TO DO
    start = st;
    size = sz;
    cir = new Object [lin.length];
    
    for(int i = 0;i<sz;i++){
      cir[st] = lin[i];
      st = (st+1)%cir.length;
    }
    
  }
  

   public void printFullLinear(){
     for(int i=0;i<cir.length;i++){
       System.out.print(cir[i]+" ");
     }
          System.out.println();              
  }

  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    int x=start;
    for(int i=0;i<size;i++){
      System.out.print(cir[x]+" ");
      x = (x+1)%cir.length;
  }
     System.out.println();   
  }


  public void printBackward(){
   int x=(size+start -1)%cir.length;
   for(int i=0;i<size;i++){
     System.out.print(cir[x]+" ");
     x--;
     if(x<0){
       x=cir.length-1;
   }
   }
    System.out.println();   
  }


   public void linearize(){
    int x=start;
    Object []b=new Object[size];
    for(int i=0;i<size;i++){
      b[i]=cir[x];
       x = (x+1)%cir.length;
  }
    cir=b;
}

    
 public void resizeStartUnchanged(int newcapacity){
    int x=start;
    Object []b=new Object[newcapacity];
    int t=start;
    for(int i=0;i<size;i++){
      b[t]=cir[x];
      x=(x+1)%cir.length;
      t=(t+1)%b.length;
    }
    cir=b;
  }
    

  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    int x=start;
    Object []b=new Object[newcapacity];
    for(int i=0;i<size;i++){
       b[i]=cir[x];
       x=(x+1)%cir.length;
  }
    cir=b;
   start=0; 
}
  
  
   public void insertByLeftShift(Object elem, int pos){
     if(size==cir.length){
      resizeStartUnchanged(cir.length+3);
     }
     int index=(start+pos)%cir.length;
    int from=start;
    int to=from-1;
    if(to<0){
      to=cir.length-1;
  }
    while(from!=index){
      cir[to]=cir[from];
      from=(from+1)%cir.length;
       to=(to+1)%cir.length;
    }
    cir[to]=cir[from];
    cir[index]=elem;
    start--;
    if(start<0){
      start=cir.length-1;
  }
    size++;
}
   

   public void insertByRightShift(Object elem, int pos){
     if(size==cir.length){
      resizeStartUnchanged(cir.length+3);
     }
     int index=(start+pos)%cir.length;
    int to=(start+size)%cir.length;
     int from=to-1;
    if(from<0){
      from=cir.length-1;
  }
    while(from!=index){
      cir[to]=cir[from];
      from--;
       if(from<0){
      from=cir.length-1;
  }
       to--;
        if(to<0){
      to=cir.length-1;
  }   
    }
    cir[to]=cir[from];
    cir[index]=elem;
    size++;
}
   
   
    public void removeByLeftShift(int pos){
    int index=(start+pos)%cir.length;
    int to=index;
    int from=(index+1)%cir.length;
    int last=(start+size-1)%cir.length;
      while(from!=last){
      cir[to]=cir[from];
      to=(to+1)%cir.length;
      from=(from+1)%cir.length;
    }
    cir[to]=cir[from];
    cir[last]=null;
    size--;
}
   

    public void removeByRightShift(int pos){
    int index=(start+pos)%cir.length;
      int to=index;
      int from=to-1;
      if(from<0){
        from=cir.length-1;
  }
      while(from!=start){
        cir[to]=cir[from];
        to--;
        if(to<0){
          to=cir.length-1;
        }
        from--;
        if(from<0){
          from=cir.length-1;
        }
}
  cir[to]=cir[from];
  cir[start]=null;
  start=(start+1)%cir.length;
  size--;
    }
    

    public void palindromeCheck(){
   int i=start;
   int j=(start+size-1)%cir.length;
   while(i!=j){
     if(cir[i]!=cir[j]){
       break;
     }
     i=(i+1)%cir.length;
     j--;
     if(j<0){
       j=cir.length-1;
  }
}
   if(cir[i]==cir[j]){
     System.out.println("This array is palindrome."); 
    }
   else{
     System.out.println("This array is NOT palindrome."); 
    }
    }
    

//This method will sort the values by keeping the start unchanged
  public void sort(){
 //int last=(start+size-1)%cir.length;

  int i=start;
 for(int g=0;g<size;g++){
    int j=(i+1)%cir.length;
  for(int f=g+1;f<size;f++){
  int k=j-1;
  if(k<0)
    k=cir.length-1;
  
  if((int)cir[j]<(int)cir[k]){
    Object temp=cir[k];
    cir[k]=cir[j];
    cir[j]=temp;
  }
  
  j=(j+1)%cir.length;
 
}
i=(i+1)%cir.length;

 }
 
  }


 public boolean equivalent(CircularArray k){
    int i=this.start;
    int j=k.start;
    int last=(start+size-1)%cir.length;
    while(i!=last){
      if (this.cir[i]!=k.cir[j]){
        break;
      }
      i=(i+1)%this.cir.length;
      j=(j+1)%k.cir.length;
    }
     if (this.cir[i]==k.cir[j]){
      return true;
     }
          return false;
        }
      }

      
      
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    