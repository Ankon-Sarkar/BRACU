public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
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
      if (size==data.length){
        throw new StackOverflowException();
      }
      else{
        data[size]=e;
      size++;
      }
    }
    
    public Object pop() throws StackUnderflowException{
      if(size==0){
        throw new StackUnderflowException();
    }
      else{
        Object temp=data[size-1];
        data[size-1]=null;
        size--;
        return temp;
}
    }
    
    public Object peek() throws StackUnderflowException{
      if(size==0){
        throw new StackUnderflowException();
      }
      else{
        return data [size-1];
      }
    }
    
    public String toString(){
      if(size==0){
        return "Empty stack";
      }
      else{
        String s="";
        for(int i=size-1;i>=0;i--){
          s=s+data[i]+" ";
        }
        return s;
}
    }
    
    public Object[] toArray(){
      Object []newarray=new Object[size];
      int j=size-1;
      for(int i=0;i<size;i++){
        newarray[i]=data[j];
        j--;
      }
      return newarray;
    }
    public int search(Object e){
      int c=0;
      for(int i=size-1;i>=0;i--){
        if(data[i]==e){
          return c;
    }
        c++;
}
      return -1;
    }
}
