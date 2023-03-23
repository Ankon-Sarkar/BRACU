
package lab.pkg4;

import java.util.Iterator;
import java.util.LinkedList;


public class DFS {
    
    String [] color;
    int [] d;
    int []f;
    int []p;
    int time=0;
    String k;
    public void dfs_method(LinkedList [] graph){
        color=new String[graph.length];
        d=new int [graph.length];
        f=new int[graph.length];
        p=new int[graph.length];
        
        for(int i=1;i<graph.length;i++){
        color[i]="White";
        p[i]=-1; 
    }
       for(int i=1;i<graph.length;i++){
           if(color[i]=="White")
               dfs_visit(graph,i);
       } 
    
    }
    
    public void dfs_visit(LinkedList [] graph,int u){
       
        if(color[u]=="White")
            System.out.println("Discovered-"+u);
        color[u]="Gray";
        time++;
        d[u]=time;
        Iterator itr =graph[u].iterator();
        while(itr.hasNext()){
             int n =(int) itr.next();
             if(color[n]=="White"){
                 p[n]=u;
                dfs_visit(graph,n);
             }
        }
        time++;
        f[u]=time;
        color[u]="Black";
    }
     public void distance(LinkedList [] graph){
     //detect the source
     
      
     
     for(int i = 1;i<graph.length;i++){
        String s = ""+i;
        int j = i;
           while(p[j]!=-1){
          
          j = p[j];
          //System.out.println(j);
          s= j +">"+ s;
        }
        System.out.println( i+"   path :"+s);
        
      }
   
}
     
     
}
