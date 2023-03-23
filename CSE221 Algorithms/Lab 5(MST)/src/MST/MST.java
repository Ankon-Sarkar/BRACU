
package MST;
import java.io.*;
import java.util.*;

public class MST {
    public  int[] parent; 
  public  int[] distance; 
  public  boolean[] visit; 
 
 
  public void prim(LinkedList [] graph,int s,String[] city){
      parent=new int[graph.length];
     distance=new int[graph.length];
     visit=new boolean[graph.length];
     
     //**intilization of parent and distance for each vartex
     for(int i=0;i<graph.length;i++){
         parent[i]=-1;
         distance[i]=Integer.MAX_VALUE;
         visit[i]=false;
     }
     
     //*initilize the source distance-->0
     distance[s] = 0;
     
     
     //**find out the min index 
     for(int i=0;i<graph.length;i++){
     int m=minKey(distance,visit,graph);
     visit[m]=true;
    
     Iterator itr =graph[m].iterator();
     int c=0;
     while(itr.hasNext()){	
        int n=(int) itr.next();
          if(visit[c]==false && n< distance[c]){
              distance[c]=n;
             parent[c]=m;
          }
          c++;
     }
     }
     for(int p=1;p<graph.length;p++){
   System.out.println(city[parent[p]]+" --> "+city[p]+" = "+distance[p]);
  }
  }
   int minKey(int distance[], boolean visit[],LinkedList graph[]) 
    { 
       
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < graph.length; v++) {
            if (visit[v] == false && distance[v] < min) { 
                min = distance[v]; 
                min_index = v; 
            } 
        }
       
        return min_index; 
    }
   
  }

