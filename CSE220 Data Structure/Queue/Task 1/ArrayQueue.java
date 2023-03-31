public class ArrayQueue implements Queue{
  int size;
  int front;
  int rear;
  Object [] data;
  
  public ArrayQueue(){
    size=0;
    front = -1;
    rear = -1;
    data = new Object[5];
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
    if(size==data.length)
      throw new QueueOverflowException();
if(size==0){
      data[size]=o;
      front++;
      rear++;
      size++;
    }
    else{
      int x=front;
      for(int i=0;i<data.length;i++){
        if(data[x]==null){
          break;
        }
        x=(x+1)%data.length;
      }
      data[x]=o;
      rear=(rear+1)%data.length;
      size++;
    }
    
  }
  
  
  public Object dequeue() throws QueueUnderflowException{
    if(size==0){
       throw new QueueUnderflowException();
    }
    Object temp=data[front];
    data[front]=null;
    front=(front+1)%data.length;
    size--;
    return temp;
  }
  
  public Object peek() throws QueueUnderflowException{
    if(size==0){
      throw new QueueUnderflowException();
  }
    else{
      return data[front];
    }
}
  
  public String toString(){
    String s="";
    int x=front;
    for(int i=0;i<size;i++){
       s=s+data[x]+ " ";
       x=(x+1)%data.length;
    }
    return s;
  }
  
  public Object[] toArray(){
    Object []a=new Object[size];
    int x=front;
    for(int i=0;i<size;i++){
      a[i]=data[x];
     x=(x+1)%data.length;
  }
    return a;
  }
  
  public int search(Object o){
     int x=front;
     int c=0;
     for(int i=0;i<size;i++){
       if(data[x]==o){
         return c;
  }
       c++;
        x=(x+1)%data.length;
}
     return -1;
  }
}