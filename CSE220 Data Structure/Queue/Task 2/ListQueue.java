public class ListQueue implements Queue{
  int size;
  Node front;
  Node rear;
  
  
  public ListQueue(){
    size = 0;
    front = null;
    rear = null;
  }
  
 public int size(){
    return size;
  }
    
  public boolean isEmpty(){
    if(size==0){
      return true;
    }
    return false;
  }
  
   public void enqueue(Object o) throws QueueOverflowException{
      Node n1=new Node(o,null);
     if(size==0){
         front =n1;
         rear=n1;
         size++;
       }
       else{
         rear.next=n1;
         rear=rear.next;
         size++;
       } 
     }
   
   public Object dequeue() throws QueueUnderflowException{
     if(size==0){
       throw new  QueueUnderflowException();
     }
     else{
       Object temp=front.val;
       front.val=null;
       front=front.next;
       size--;
       return temp;
     } 
}
   
   public Object peek() throws QueueUnderflowException{
     if(size==0){
       throw new QueueUnderflowException();
     }
     else{
     return front.val;
}
   }
   
   public String toString(){
     Node x=front;
     String s="";
     while(x!=null){
       s=s+x.val +" ";
       x=x.next;
     }
     return s;
}
   
   public Object[] toArray(){
     Object []a=new Object[size];
     Node x=front;
     for(int i=0;i<size;i++){
       a[i]=x.val;
       x=x.next;
}
     return a;
   }
   
   public int search(Object o){
     Node x=front;
     int c=0;
     while(x!=null){
       if(x.val==o){
         return c;
       }
       c++;
       x=x.next;
     }
     return -1;
}
}

