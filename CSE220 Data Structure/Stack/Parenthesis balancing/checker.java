//checks parenthesis balancing using stack

import java.util.Scanner;
public class checker{
  

public static void main (String [] args){
  Scanner sin=new Scanner(System.in);
  ListStack stack=new ListStack();
 boolean flag=true;
  try{
  String s=sin.next();
  for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='('){
      stack.push(s.charAt(i));
    }
    
    if(s.charAt(i)=='{'){
      stack.push(s.charAt(i));
    }
      
    if(s.charAt(i)=='['){
      stack.push(s.charAt(i));
    }
    
    if(s.charAt(i)==')' || s.charAt(i)=='}'|| s.charAt(i)==']' ){
      Object x=stack.pop();
      if(x.equals('(') && s.charAt(i)==')' || x.equals('{') && s.charAt(i)=='}' || x.equals('[') && s.charAt(i)==']'){
      }
      else{
       flag=false;
       break;
      }
    }
  }
  
   if(!stack.isEmpty() || !flag){
   System.out.println("Error");
 }
   else
      System.out.println("OK");
 }

  catch(StackOverflowException e){
  System.out.println("Stack is over flow");
  System.out.println("Error");
  }
  
   catch(StackUnderflowException e){
     System.out.println("Stack is under flow");
     System.out.println("Error");
  } 
}
}


                            