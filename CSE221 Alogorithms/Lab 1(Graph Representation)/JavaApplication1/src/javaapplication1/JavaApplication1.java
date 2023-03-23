/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author 18301273
 */
import java.io.*;
import java.util.*;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
     int [][] graph;
    BufferedReader obj= null;
    try {
      String str;
      FileReader fr = new FileReader("C:\\Users\\USER\\Desktop\\CSE 221 labs\\LAB 1\\JavaApplication1\\input.txt");
      obj = new BufferedReader(fr);
      str = obj.readLine();
      // convert this to int
      // System.out.println(str);
      int v = Integer.parseInt(str);
      str = obj.readLine();
      System.out.println(str);
      System.out.println(v);
      graph=new int[v][v];
      while ((str = obj.readLine()) != null) {
        // tokenize = a,b
        //StringTokenizer st = new StringTokenizer(str," ");
          String []x=str.split(" ");
        int token1 = Integer.parseInt(x[0]);
        
        int token2 = Integer.parseInt(x[1]);
        System.out.println(token1);
        //connect graph [a][b] = 1 graph[b][a] = 1
       graph [token1] [token2]=1;
       graph [token2] [token1]=1;
      }
      
     
      
    } 
    catch (IOException e) {
      
      e.printStackTrace();
      
    }
//     for (int i= 0;i<graph.length;i++){
//    for(int j = 0;j < graph[0].length;j++){
//      // print
//    }
//  }
  }
  
 
}

