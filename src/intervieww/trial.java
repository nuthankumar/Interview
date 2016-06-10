/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Davidvilla
 */

class trial{  
 public static void main(String args[]){  
   
 List<String> al;//creating arraylist  
        al = (List<String>) Collections.unmodifiableCollection(new ArrayList<String>() {

     @Override
     public int size() {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean isEmpty() {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean contains(Object o) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public Iterator<String> iterator() {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public Object[] toArray() {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public <T> T[] toArray(T[] a) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean add(String e) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean remove(Object o) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean containsAll(Collection<?> c) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean addAll(Collection<? extends String> c) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean addAll(int index, Collection<? extends String> c) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean removeAll(Collection<?> c) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public boolean retainAll(Collection<?> c) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public void clear() {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public String get(int index) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public String set(int index, String element) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public void add(int index, String element) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public String remove(int index) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public int indexOf(Object o) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public int lastIndexOf(Object o) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public ListIterator<String> listIterator() {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public ListIterator<String> listIterator(int index) {
         throw new UnsupportedOperationException("Not supported yet.");
     }

     @Override
     public List<String> subList(int fromIndex, int toIndex) {
         throw new UnsupportedOperationException("Not supported yet.");
     }
 });
 
  al.add("Ravi");  
  al.add("Ajay");  
  al.removeAll(al);
  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }
}  