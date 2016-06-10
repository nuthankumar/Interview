/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Davidvilla
 */
public class ArrayListss {
 
 public static void main(String args[]){  
   
  final  ArrayList<String> al; //=new ArrayList<String>();// static cant be used, arraylist is dynamic 
   {
     al=new ArrayList<String>();
 }
  
  final ArrayList al1=new ArrayList();//creating arraylist  
  al.add("Ravi");//adding object in arraylist  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  for(String obj:al){
      obj="nuthan";
     //al.add(obj); //ConcurrentModificationException
      al1.add(obj);
      al1.add(2);
  }
  Iterator itr=al1.iterator();//getting Iterator from arraylist to traverse elements  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}
