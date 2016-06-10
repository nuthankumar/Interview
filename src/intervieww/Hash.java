/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Davidvilla
 */
class Student implements Comparable {

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
    	return this.name+" "+this.age+" "+this.rollno;
    	
    }
    @Override
    public int compareTo(Object o) {
        // throw new UnsupportedOperationException("Not supported yet.");
        Student st = (Student) o;
        if (age == st.age) {
            return 0;
        } else if (age > st.age) {
            return 1;
        } else {
            return -1;
        }
    }
  
}

public class Hash {

    public static void main(String args[]) {
        //Creating user-defined class objects  
        Student s1 = new Student(101, "Sonoo", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanumat", 25);
        Student s4 = new Student(104, "nuthan", 29);

        ArrayList<Student> al = new ArrayList<Student>();//creating arraylist  
        LinkedList<Student> al1 = new LinkedList<Student>() {
        };
        HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
        //ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);//adding Student class object  
        al.add(s2);
        al.add(s3);
        hm.put(1, s1);
        hm.put(2, s2);
        hm.put(3, s3);
       // Collections.sort(al1); // not comparable Student objects

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue().toString());
            al1.add((Student) m.getValue());
            //hm.values().add(s4);
             Collections.sort(al1);
        }
        Iterator itr = al1.iterator();
        //traversing elements of ArrayList object  
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            //itr.remove();
            // Collections.sort(al1);
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
