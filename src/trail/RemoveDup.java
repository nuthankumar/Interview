/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Davidvilla
 */
public class RemoveDup {

    static void display(ArrayList<String> al) {
        for (String obj : al) {
            System.out.println(obj);
        }
    }

    static ArrayList<String> method(ArrayList<String> al) {
        final ArrayList<String> al2 = new ArrayList<String>();

        Iterator itr = al.iterator();
        String s;
        while (itr.hasNext()) {
            s=(String)itr.next();
            if(!al2.contains(s))
            al2.add(s);
        }
        return al2;
    }

    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("nuthan");
        al.add("dsfffsfd");
        al.add("nuthan");
        al.add("helloo");
        al.add("keertha");
        al.add("akhil");
        al.add("helloo");
        ArrayList<String> al2 = RemoveDup.method(al);

        System.out.println("before removing duplicate");
        display(al);
        System.out.println("after removing duplicate");
        display(al2);

    }
}
