public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
    Node n1=new Node(a[0],null);
    head =n1;
    for(int i=1;i<a.length;i++){
      Node n2=new Node(a[i],null);
      n1.next=n2;
      n1=n2;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int c=0;
    Node h=head;
    while(h!=null){
      c++;
      h=h.next;
    }
    return c; 
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO 
    Node h=head;
    while(h!=null){
      System.out.print(h.element+" ");
      h=h.next;
    }
     System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
  Node h=head;
  if(idx<0 || idx>=countNode()){
    return null; 
  }
  else{
    int c=0;
    while(h!=null){
      if(idx==c){
        return h;
      }
  c++;
  h=h.next;
    }
  }
  return null;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
     Node h=head;
  if(idx<0 || idx>=countNode()){
    return null; 
  }
  else{
    int c=0;
    while(h!=null){
      if(idx==c){
        return h.element;
      }
  c++;
  h=h.next;
    }
  }
  return null;
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
     Node h=head;
  if(idx<0 || idx>=countNode()){
    return null; 
  }
  else{
    int c=0;
    while(h!=null){
      if(idx==c){
        Object temp=h.element;
        h.element=elem;
        return temp;
      }
  c++;
  h=h.next;
    }
  }
  return null;
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
   Node h=head;
   int c=0;
   while(h!=null){
     if(elem.equals(h.element)){
       return c;
     }
        c++;
        h=h.next;
        }
     return -1; 
}
  
 
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
    Node h=head;
    while(h!=null){
       if(elem.equals(h.element)){
         return true;
       }
       h=h.next;
    }
    return false; 
  }
//  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    Node h=head;
   Node n1=new Node(h.element,null);
    head=n1;
   h=h.next;
   while(h!=null){
     Node n2=new Node(h.element,null);
     n1.next=n2;
     n1=n2;
     h=h.next;
   }
    return head; 
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
     Node h=head;
   Node n1=new Node(h.element,null);
   // head=n1;
   h=h.next;
   while(h!=null){
     Node n2=new Node(h.element,null);
     n2.next=n1;
     n1=n2;
     h=h.next;
   }
   head=n1;
    return head;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
  Node h=head;
        Node n1=new Node (elem,null);
        if(idx==0){
         n1.next=h;
         head=n1;
        }
      if(idx!=0 && idx<countNode()){
          int i=0;
          while(i<idx-1){
            h=h.next;
            i++;
          }
          Node x=h.next;
          h.next=n1;
          n1.next=x;
    }
     if(idx==countNode()){
          while(h.next!=null){
            h=h.next;
          }
          h.next=n1;
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    if(index<0 || index>=countNode()){
      return null;
    }
    else if(index==0){
      Node h=head;
      head=h.next;
      return h.element;
    }
    else{
    Node h=head;
    int i=0;
    while(i<index-1){
      h=h.next;
      i++;
    }
    Node del=h.next;
    Node x=del.next;
    h.next=x;
    
    return del.element;
  }
  }
   
  
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
   
    Node n=new Node(head.element,null);
    head=head.next;
    Node h=head;
    while(h.next!=null){
      h=h.next;
    }
   h.next=n;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
    Node h=head;
    int c=0;
    while(h.next!=null){
      h=h.next;
  }

   Node n=new Node (h.element,null);
   n.next=head;
    head=n;
  Node k=head;
  int i=0;
  while(i<countNode()-2){
    k=k.next;
    i++;
}
  k.next=null;
}
}
