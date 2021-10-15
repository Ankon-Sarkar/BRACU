public class DoublyList{
    public Node head; 
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null,null,null); //dummy
        Node tail = head;
        for(int i = 0;i< a.length;i++){
            Node np = new Node(a[i],null,null);
            tail.next = np;
            np.prev = tail;
            np.next = head;
            head.prev = np; 
            tail = np;
        }
        
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
     /* Counts the number of Nodes in the list */
    public int countNode(){
       Node h=head.next;
       int c=0;
       while(h!=head){
         c++;
         h=h.next;
       }
        return c; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
      Node h=head.next;
      while(h!=head){
        System.out.print(h.element+" ");
        h=h.next;
    }
      System.out.println();
    }
    public void backwardprint(){
        Node h=head.prev;
        while(h!=head){
     System.out.print(h.element+" ");
        h=h.prev;
    }
        System.out.println();
    }
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
      Node h=head.next;
      if(idx<0 || idx>=countNode()){
        return null; 
    }
      else{
        int c=0;
        while(h!=null){
          if(c==idx){
            return h;
          }
          h=h.next;
          c++;
      }
      }
      return null;
    }

    
//    /* returns the index of the Node containing the given element.
//     if the element does not exist in the List, return -1.
//     */
    public int indexOf(Object elem){
        // TO DO
      Node h=head.next;
      int c=0;
      while(h!=head){
        if(h.element.equals(elem)){
          return c;
        }
        c++;
        h=h.next;
      }
        return -1; 
    }
    


//    /* inserts Node containing the given element at the given index
//     * Check validity of index.
//     */
    public void insert(Object elem, int idx){
        // TO DO
        Node h=head.next;
        Node n1=new Node (elem,null,null);
        if(idx==0){
         n1.next=h;
         h.prev=n1;
        head.next=n1;
        n1.prev=head;
        }
      if(idx!=0 && idx<countNode()){
          int i=0;
          while(i<idx-1){
            h=h.next;
            i++;
          }
          Node x=h.next;
          h.next=n1;
          n1.prev=h;
          n1.next=x;
          x.prev=n1;
         
    }
     if(idx==countNode()){
          while(h.next!=head){
            h=h.next;
          }
          h.next=n1;
          n1.prev=h;
          n1.next=head;
          head.prev=n1;
    }
    }
    
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
      Node h=head.next;
      if(index<0 || index>=countNode()){
        return null; 
    }
      if(index==0){
        Node x=h.next;
        head.next=x;
        x.prev=head;
        return h.element; // please remove this line!
    }
      else{
        int i=0;
        while(i<index-1){
          h=h.next;
          i++;
        }
        Node del=h.next;
        Node x=del.next;
        h.next=x;
        x.prev=h;
      return del.element;
    }
}
}
