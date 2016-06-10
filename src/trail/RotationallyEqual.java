/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class RotationallyEqual {

    static boolean method(String s, String s1) {
        String s2 = s + s;
        if (s2.contains(s1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String s = "nuthan";
        String r = "uthann";
        String b = "tshtha";

        boolean a = method(s, r);
        boolean b1 = method(s, b);

        System.out.println(a);
        System.out.println(b1);



    }
}
