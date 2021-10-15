public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
     public int size(){
      return size;
    }
public boolean isEmpty(){
      if(size==0){
        return true;
      }
      else{
        return false;
      }
}
      public void push(Object e) throws StackOverflowException{
        Node n=new Node (e,null);
        n.next=top;
        top=n;
        size++;
}
      public Object pop() throws StackUnderflowException{
        if(top==null){
          throw new StackUnderflowException();
        }
        else{
          Node h=top;
          top=h.next;
          h.next=null;
          size--;
          return h.val;
        }
      }
      public Object peek() throws StackUnderflowException{
        if(size==0){
          throw new StackUnderflowException();
        }
        else{
          return top.val;
        }
      }
      public String toString(){
        if(size==0){
          return "Empty Stack";
        }
        else{
          Node h=top;
          String s=" ";
          while(h!=null){
            s=s+h.val+" ";
            h=h.next;
          }
          return s;
        }
      }
      public Object[] toArray(){
        Object []newarray=new Object[size];
        Node h=top;
        int r=0;
        while(h!=null){
          newarray[r]=h.val;
          h=h.next;
          r++;
        }
        return newarray;
      }
      public int search(Object e){
        Node h=top;
       int c=0;
        while(h!=null){
          if(h.val==e){
            return c;
          }
          h=h.next;
          c++;
       }
       return -1;
      }
}
          
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      