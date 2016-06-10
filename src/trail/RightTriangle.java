/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class RightTriangle {

    static void method(int a) {
        int count = 1;
        while (count <= a) {
            for (int i = 1; i <= count; i++) {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }

    public static void main(String args[]) {

        method(5);
    }
}
