
package lab.pkg3;

import java.util.*;
public class BFS{
  
  //LinkedList [] graph;
  
  int [] level;
  
  int [] parent;
  String [] color;
  Queue q;
  
  public void bfs_method (LinkedList [] graph,int s){
    
    color=new String[graph.length];
    level=new int[graph.length];
    parent=new int[graph.length];
    for(int i=1;i<graph.length;i++){
        color[i]="White";
        parent[i]=-1;
    }
    
    q = new LinkedList<Integer>();
    q.add(s);
    color[s]="Gray";
    level[s]=0;
    while (!q.isEmpty()) {
        int u=(int) q.remove();
        //System.out.println(u+" ");
            Iterator itr =graph[u].iterator();
        while(itr.hasNext()){
             int n =(int) itr.next();
             if(color[n]=="White"){
                 color[n]="Gray";
                 parent[n]=u;
                 q.add(n);
                 level[n]=level[u]+1;
             }
        }
        color[u]="Black";
        }
    }
  
 public void distance(LinkedList [] graph){
     //detect the source
     for(int i = 1;i<graph.length-1;i++){
 
      if (parent[i]==-1){
         System.out.println(i+" is the Source.");
      }
      }
     
     for(int i = 1;i<graph.length;i++){
        String s = ""+i;
        int j = i;
           while(parent[j]!=-1){
          
          j = parent[j];
          //System.out.println(j);
          s= j +">"+ s;
        }
        System.out.println(i+" : distance from source "+level[i]+ "   path :"+s);
      }
    }
}
 

   



