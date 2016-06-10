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
public class ArrayListEx {

    ArrayListEx() {
    }

    public static void main(String[] args) {

        int b[] = {1, 2, 4, 5, 6, 2, 5, 7, 8, 4};
        int c[] = {3, 2, 3, 5, 6, 3, 23, 4, 45, 23, 34};
        // int d[];

        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        ArrayList<Integer> al4 = new ArrayList<Integer>();
        ArrayList<Integer> al5 = new ArrayList<Integer>();
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(6);
        al.add(7);
        al.add(8);
        al2.add(12);
        al2.add(13);
        al2.add(14);
        al2.add(16);
        al2.add(17);
        al2.add(18);


        ArrayListEx abc = new ArrayListEx();
        int b1 = abc.min(b);
        int c1 = abc.min(c);
        int m1 = abc.median(b);
        int m2 = abc.median(c);
        int u1[] = abc.union(b, c);
        al3 = abc.union(al, al2);
        al4 = abc.difference(b, c);
        al5 = abc.intersect(al, al2);
        System.out.println("element" + b1);
        System.out.println(b1);
        System.out.println("element" + c1);
        System.out.println(c1);
        System.out.println("element" + m1);
        System.out.println(m1);
        System.out.println("element" + m2);
        System.out.println(m2);
        System.out.println("elementsssssssss             u1");
        display(u1);
        System.out.println("elementsssssssss         a13");
        arrDisplay(al3);
        System.out.println("elementsssssssss             a14");
        arrDisplay(al4);
        System.out.println("elementsssssssss             a15");
        arrDisplay(al5);

    }

    static void display(int a[]) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void arrDisplay(ArrayList<Integer> a) {

        for (Integer obj : a) {
            System.out.println(obj.intValue());
        }


    }

    //Return the smallest element of the array
    public static int min(int[] a) {

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;


    }

    public static int[] union(int[] a1, int[] a2) {

        int[] c = new int[a1.length + a2.length];
        //copy a1 into c
        for (int i = 0; i < a1.length; i++) {
            c[i] = a1[i];
        }
        //copy a2 into c
        for (int i = 0; i < a2.length; i++) {
            c[i + a1.length] = a2[i];
        }
        /*for(int i = a1.length; i<c.length; i++) 
         c[i] = a2[i-a1.length];*/

        return c;




    }

    public static ArrayList<Integer> difference(int[] a1, int[] a2) {

        ArrayList<Integer> dList = new ArrayList<Integer>();

        for (int i = 0; i < a1.length; i++) {
            //check if a1[i] is in a2
            boolean appears = false;
            for (int j = 0; j < a2.length; j++) {
                if (a2[j] == a1[i]) {
                    appears = true;
                }
            }

            if (!appears) {
                dList.add(a1[i]);
            }


        }

        return dList;



    }

    public static int median(int[] a) {
        return 0;
    }

    public static int skewness(int[] a) {
        return 0;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        ArrayList<Integer> u = new ArrayList<Integer>();
        //add all elements of a1 and a2 to the list u
        for (int i = 0; i < a1.size(); i++) {
            int x = a1.get(i);
            u.add(x);
        }
        for (int i = 0; i < a2.size(); i++) {
            u.add(a2.get(i));
        }

        return u;

    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        ArrayList<Integer> iList = new ArrayList<Integer>();
        for (int i = 0; i < a1.size(); i++) {
            int x = a1.get(i);
            //check if x appears in list a2 or not
            //if it appears, then add x to list iList

            boolean found = false;
            int j = 0;
            while (!found && j < a2.size()) {
                if (a2.get(j) == x) {
                    found = true;
                }
                j++;
            }
            if (found) {
                iList.add(x);
            }
        }

        return iList;
    }
}
