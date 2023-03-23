
package lab.pkg4;
import java.io.*;
import java.util.*;
public class Lab4 {

    
    public static void main(String[] args) throws IOException{
       String str;
       BufferedReader obj=null; 
       try{
          FileReader fr=new FileReader("graph.txt");
          obj=new BufferedReader(fr);
       }
       catch(Exception e){
           System.out.println("File not found");
       }
      str =obj.readLine();
       int v=Integer.parseInt(str);
      
       
      
       LinkedList[] undirected_list = new LinkedList[v+1];
      
     
       for(int i=0;i<undirected_list.length;i++){
           undirected_list[i] = new LinkedList<>();
          
       }
       
       str =obj.readLine();
         
         while(str!=null){
              String []x=str.split(" ");
        int token1 = Integer.parseInt(x[0]);
        int token2 = Integer.parseInt(x[1]);
        
       
       //create undirected list
       undirected_list[token1].add(token2); 
       undirected_list[token2].add(token1);
       //create undirected list
       
               str =obj.readLine();
         }
         DFS d=new DFS();
         d.dfs_method(undirected_list);
       d.distance(undirected_list);
    }
    
}
