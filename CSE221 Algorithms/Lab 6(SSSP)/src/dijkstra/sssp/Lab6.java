
package dijkstra.sssp;
import java.io.*;
import java.util.*;


public class Lab6 {
//tester class
    public static void main(String[] args) {
           String [] city = {"Motijheel" , "A" , "B" , "C" , "D", "E" , 
                                    "F" , "G" , "H" , "I" , "J" , "K" , "L" , "MOGHBAZAR" };
         LinkedList [] graph=new LinkedList[city.length];
         for(int i=0;i<graph.length;i++){
           graph[i] = new LinkedList<>();
    }
        File file = new File ("input.txt");
    
       Scanner sin=null;
       try{
       sin=new Scanner(file);
}
    catch(Exception e){
    System.out.println("File not found");
    }
       while(sin.hasNext()){
           String s1=sin.next();
            String s2=sin.next();
            int a = 0,b=0;
            ///int b=0;
           for(int i=0;i<city.length;i++){ 
               if(s1.equals(city[i]))
                   a=i;
       }
           for(int i=0;i<city.length;i++){ 
               if(s2.equals(city[i]))
                   b=i;
       }
      graph[a].add(new edge(b,sin.nextInt()));
}
        //for (int i =0;i< graph.length;i++) {
            //Iterator itr =graph[i].iterator();
            //System.out.print(city[i]+"-->");
           // while(itr.hasNext()){
           // System.out.print(" "+itr.next());
           // }
          //  System.out.println();
       // }
        Sssp g=new Sssp();
        g.Dijkstra(graph,city,"Motijheel","MOGHBAZAR");
}
}

