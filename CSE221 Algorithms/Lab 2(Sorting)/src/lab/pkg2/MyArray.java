
package lab.pkg2;

import java.util.*;
public class MyArray {
    
    
    
     public  int[] mergesort(int []a,int l,int r){
   
if(l<r){
   
 int  m=(l+r)/2;

 
 int [] m1=mergesort(a,l,m);
  int [] m2=mergesort(a,m+1,r);
  int [] m3=merge(a,l,m,r);
  return m3;

}
return a;
}
    public  int[] merge(int[]a,int l,int m,int r){

        int n1=m-l+1;
        int n2=r-m;
        int []L=new int [n1+1];
        int []R=new int[n2+1];
        int inf=(int) (Math.pow(2,31)-1);
        for(int i=0;i<n1;i++){
            L[i]=a[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=a[m+j+1];
        }
         L[n1]=R[n2]=inf;
        
         int i = 0,j=0;
        for(int k=l;k<=r;k++){
            if(L[i]<R[j]){
                a[k]=L[i];
                i++;
            }
            else{
                a[k]=R[j];
                j++;
            }
                
            }
        return a;
    }
    
    
    public int[] quicksort(int []a,int start,int end){
        if(start<end){
        int p=partition(a,start,end);
        int []q1=quicksort(a,start,p-1);
        int []q2=quicksort(a,p+1,end);
    }
        return a;
}

    public int partition(int []a,int start,int end){
       int pivot=a[end];
       int pindx=start;
       for(int i=start;i<end;i++){
           if(a[i]<=pivot){
              int temp=a[i];
              a[i]=a[pindx];
              a[pindx]=temp;
              pindx++;
           }
       }
            int t=a[end];
            a[end]=a[pindx];
            a[pindx]=t;
           return pindx;         
       }
       
        
        
    }

    
