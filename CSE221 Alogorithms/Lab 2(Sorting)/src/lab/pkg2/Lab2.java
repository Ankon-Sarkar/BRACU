
package lab.pkg2;


public class Lab2 {

  
    public static void main(String[] args) {
        
        //MergeSort
        int [] arr={10,4,2,3,1,9,5,7,2,4,7777};
        MyArray m=new MyArray();
        System.out.println("MergeSort Outputs-");
     int []temp=m.mergesort(arr,0,arr.length-1);
     for(int i=0;i<temp.length;i++)
         System.out.println(temp[i]);
    
     //QuickSort
     System.out.println("\nQuickSort Outputs-");
     int[]a={3,4,1,2,4,2,1,22,33,11,44};
     MyArray q=new MyArray();
     int []temp2=q.quicksort(a,0,a.length-1);
     for(int i=0;i<temp2.length;i++)
         System.out.println(temp2[i]);
     
}
}
