
package lab;
import java.io.*;
import java.util.*;

public class Lab {

    
    public static void main(String[] args)  throws IOException {
       int [] [] undirected_graph;
       int [] [] directed_graph;
        String str;
       BufferedReader obj=null; 
       try{
          FileReader fr=new FileReader("input.txt");
          obj=new BufferedReader(fr);
       }
       catch(Exception e){
           System.out.println("File not found");
       }
       str =obj.readLine();
       int v=Integer.parseInt(str);
       System.out.println(v);
       
       undirected_graph=new int[v] [v];
       directed_graph=new int[v] [v];
       LinkedList[] undirected_list = new LinkedList[v];
       LinkedList[] directed_list = new LinkedList[v];
     // LinkedList<Integer> undirected_list = new LinkedList<Integer>();
      // LinkedList<Integer> directed_list = new LinkedList<Integer>();
       for(int i=0;i<undirected_list.length;i++){
           undirected_list[i] = new LinkedList<>();
           directed_list[i] = new LinkedList<>();
       }
       
       str =obj.readLine();
         
         while(str!=null){
              String []x=str.split(" ");
        int token1 = Integer.parseInt(x[0]);
        int token2 = Integer.parseInt(x[1]);
        
       //create undirected graph(matrix) 
       undirected_graph [token1][token2]=1;
       undirected_graph [token2][token1]=1;
       
       //create directed graph(matrix)
       directed_graph [token1][token2]=1;
       
       //create undirected list
       undirected_list[token1].add(token2); 
       undirected_list[token2].add(token1);
       //create undirected list
        directed_list[token1].add(token2);
               str =obj.readLine();
         }
         
         //prints undirected graph(Matrix)
         System.out.println("Undirected Graph...\nAdjacency Matrix :-");
          System.out.print(" ");
         for(int i=0;i<undirected_graph.length;i++){
             System.out.print(" "+i);
         }
         System.out.println();
         
     for(int i=0;i<undirected_graph.length;i++){
             System.out.print(i+" ");
             for(int j=0;j<undirected_graph.length;j++){
                 System.out.print(undirected_graph[i][j]+" ");
             }
             System.out.println();
     }  
    
     //prints undirected list
      System.out.println("\nList for undirected graph");
        for (int i =0;i<undirected_list.length;i++) {
            Iterator itr =undirected_list[i].iterator();
            System.out.print(i+"-->");
            while(itr.hasNext()){
            System.out.print(itr.next()+" ");
            }
            System.out.println();
        }
         
    //print outdegree 
    System.out.println("\n undirected graph out degree:");
        for (int i =0;i<undirected_list.length;i++) {
       Iterator itr =undirected_list[i].iterator();
           System.out.print(i+"-->");
           int c=0;
           while(itr.hasNext()){
                itr.next();
            c++;
            }
            System.out.println(c);
        }
//prints directed graph(Matrix)
         System.out.println("\ndirected Graph...\nAdjacency Matrix :-");
          System.out.print(" ");
         for(int i=0;i<directed_graph.length;i++){
             System.out.print(" "+i);
         }
         System.out.println();
         
     for(int i=0;i<directed_graph.length;i++){
             System.out.print(i+" ");
             for(int j=0;j<directed_graph.length;j++){
                 System.out.print(directed_graph[i][j]+" ");
             }
             System.out.println();
     }
     
     //print directed graph
      System.out.println("\nList for directed graph");
        for (int i =0;i<directed_list.length;i++) {
            Iterator itr =directed_list[i].iterator();
            System.out.print(i+"-->");
            while(itr.hasNext()){
            System.out.print(itr.next()+" ");
            }
            System.out.println();
        }
        
       //print inorder outorder degree
       System.out.println("\nDegree of directed graph");
        int in[]=new int[v];
        int out[]=new int[v];
        for (int i =0;i<directed_list.length;i++) {
             Iterator itr =directed_list[i].iterator();
             while(itr.hasNext()){
                 int temp=(int) itr.next();
                 in[temp]++;
                 out[i]++;
             }
        }
   for(int i=0;i<directed_list.length;i++) {
System.out.println(i+"-->"+out[i]+"/"+in[i]  );
}
    }
}

