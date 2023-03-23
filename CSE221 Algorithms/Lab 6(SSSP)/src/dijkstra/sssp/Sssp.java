
package dijkstra.sssp;
import java.io.*;
import java.util.*;
        
public class Sssp {
    public  int[] parent; 
  public  int[] distance; 
  public  boolean[] visit; 
 
  public void Dijkstra(LinkedList [] graph,String[] city,String start,String end){
      parent=new int[graph.length];
     distance=new int[graph.length];
     visit=new boolean[graph.length];
     
     //**intilization of parent and distance for each vartex
     for(int i=0;i<graph.length;i++){
         parent[i]=-1;
         distance[i]=Integer.MAX_VALUE;
         visit[i]=false;
     }
     
     int start_index=-1,end_index=-1;
    for(int i=0;i<city.length;i++) {
        if(start.equals(city[i]))
            start_index=i;
    }
    
    
    for(int i=0;i<city.length;i++) {
        if(end.equals(city[i]))
            end_index=i;
    }
    
    //*initilize the source distance-->0
     distance[start_index] = 0;
     
     
     //**find out the min index 
     for(int i=0;i<graph.length;i++){
     int m= minKey(distance,visit,graph);
     visit[m]=true;
    
     Iterator itr =graph[m].iterator();
    
     while(itr.hasNext()){	
        edge n= (edge) itr.next();
       // System.out.println(n.e);
          if(visit[n.e]==false && distance[m]+n.w < distance[n.e]){
              distance[n.e]=distance[m]+n.w ;
             parent[n.e]=m;
          }
         
     }
     }
    int v = end_index;
        String s = " "+city[v];
        
        int j = v;
           while(parent[j]!=-1){
          j = parent[j];
          //System.out.println(j);
          s= city[j] +"-->"+ s;
        }
  //}
    System.out.println(start+" to " +end +" shortest path is : -  " +s+"\n cost: "+distance[end_index]);
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
        //System.out.println("///"+min_index);
        return min_index; 
    }
   
   
   
  }

