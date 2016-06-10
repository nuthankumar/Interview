/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class UltaTriangle {

    static int count = 0;

    static void method(int a) {

        while (a >= 0) {
            for (int i = 1; i <= count; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= a; i++) {
                System.out.print("0");
            }
            System.out.println();

            a = a - 2;
            count++;
        }
        
    }
    

    public static void main(String args[]) {

        method(8);
    }
}
