/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

import java.util.ArrayList;

/**
 *
 * @author Davidvilla
 */
public class StaticEx {

    static class Counter {

        static int count = 0;//will get memory when instance is created  
        //static final int count = 0; //final variable cannot be changed.

         private Counter() {
            count++;
            System.out.println(count);
        }
    }
    int id;
    String name;
    static int a;
    static String coll = "nuthan";

    static {
        a = 0;
    }

    private StaticEx() {
        a=a+1;
    }

    private StaticEx(int i, String n) {
        id = i;
        name = n;
    }

    static void change() {
        coll = "BBDIT";
    }

    static void display() {
        //System.out.println(id + " " + name);// static method cannot access non static variable.
        System.out.println("static cannot access non static variable " + a);
        a = a + 1;

        StaticEx abc = new StaticEx();
        abc.a = 200;
    }

    void display1() {
        System.out.println(id + " " + name + "   " + coll);
        System.out.println("non static method can access static and non static variable " + a);
        a = a + 1;
    }

    public static void main(String args[]) {
        StaticEx s1 = new StaticEx(111, "Karan");
        StaticEx s2 = new StaticEx(222, "Aryan");
        final ArrayList<StaticEx> al = new ArrayList<StaticEx>();
        // final  ArrayList<StaticEx> cloneal= new ArrayList<StaticEx>();
      //  static ArrayList<StaticEx> cloneal= new ArrayList<StaticEx>();// cannot assign static to an arraylist

        ArrayList<StaticEx> cloneal = new ArrayList<StaticEx>();
        s1.display();
        s2.display();
        s1.display1();
        s2.display1();
        StaticEx.change();
        s1.display();
        s2.display();
        s1.display1();
        s2.display1();
        // al=cloneal; // cannot assign
        al.add(s2);
        al.add(s1);
        cloneal = (ArrayList<StaticEx>) al.clone();
        // cloneal=(ArrayList<StaticEx>)al.clone();// cannot assign a value to final variable
        System.out.println(al);
        System.out.println(cloneal);
        boolean contains = cloneal.contains(s2);
        System.out.println(contains);
        cloneal.removeAll(al);
        contains = cloneal.contains(s2);
        System.out.println(contains);
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
