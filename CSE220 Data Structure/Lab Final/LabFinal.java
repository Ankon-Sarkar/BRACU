public class LabFinal{
  
  Node head;
  int [] a;
  
  //Task 1: Given a circular array, start and size, create a Dummy headed singly list
  // The number pointed by st will be the first number of the list
  public LabFinal(int [] cir, int st, int sz){
    // TO DO
    int x=st;
    Node n1=new Node(0,null);
    head=n1;
    for(int i=0;i<sz;i++){
     Node n2=new Node(cir[x],null);
     n1.next=n2;
     n1=n2;
     x=(x+1)%cir.length;
    }
    
  }
  
  //Task 2:
  // Consider the linked list as a stack and the first real node (the node after dummy head) is the last node added
  // Pop the node and Print the element
  public void pop(){
    //TO DO
    Node h=head.next;
    int p=h.item;
    h.item=0;
    head.next=h.next;
    System.out.println(p);
  }
  
  //Task 3:
  // Using RECURSION search for the element x from the list
  public boolean search(int x,Node h){
    // TO DO
    if(h!=null){
      if(x==h.item){
        return true;
      }
      return search(x,h.next);
    }
    
    return false;
  }
  
  //Task 4:
  //Consider the linked list as a Queue and the last node is the last element added
  public void enqueue(int x){
    // TO DO
    Node h=head.next;
    Node n=new Node(x,null);
    while(h.next!=null){
      h=h.next;
    }
    h.next=n;
  }
  
  //Task 5
  //Using the elements of the list create a Linear Array
  // The array, named a, has been declared at the top of this file
  public void toArray(){
    // TO DO
    int c=0;
    Node h=head.next;
    while(h!=null){
      c++;
      h=h.next;
    }
    a=new int[c];
    int r=0;
    Node x=head.next;
    while(x!=null){
      a[r]=x.item;
      r++;
      x=x.next;
    }
    for(int i=0;i<a.length;i++){
    System.out.print(a[i]+ " ");
    }
    System.out.println();
    
  }
  
  // Task 6
  //Apply INSERTION SORT on the array and print
  public void printSorted(){
    // TO DO
    for(int i=1;i<a.length;i++){
      int min=a[i];
      int j=i-1;
      while(j>=0 && min<a[j]){
        //int x=a[j];
        //a[j]=a[j+1];
        a[j+1]=a[j];
        j--;
      }
      a[j+1]=min;
    }
     for(int i=0;i<a.length;i++){
    System.out.print(a[i]+" ");
  }
}
}
  
  
  
  