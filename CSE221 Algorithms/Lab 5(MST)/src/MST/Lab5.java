
package MST;
import java.io.*;
import java.util.*;

public class Lab5 {

   
    public static void main(String[] args) throws IOException  {
        String str;
        BufferedReader obj=null;
        try{
            FileReader fr=new FileReader("MST.txt");
            obj=new BufferedReader(fr);
        }
        
        catch(Exception e){
            System.out.println("File not found");
        }
        
       str= obj.readLine();
       String []x=str.split(" ");
       //System.out.println(x.length);
    String [] city=new String[x.length];
    for(int i=0;i<city.length;i++){
        city[i]=x[i];
    }
    LinkedList [] graph=new LinkedList[x.length];
    for(int i=0;i<graph.length;i++){
           graph[i] = new LinkedList<>();
    }
   str=obj.readLine();
   int j=0;
  while(str!=null) {
      String []sp=str.split("	");
      //int j=0;
      for(int i=0;i<sp.length;i++){
          int a=Integer.parseInt(sp[i]);
  graph[j].add(a);
  }
      j++;
   str=obj.readLine();
  }
  
  MST p=new MST();
 p.prim(graph, 0,city);
 
         
}
}