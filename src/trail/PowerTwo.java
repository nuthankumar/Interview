/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class PowerTwo {

    static int recPow(int num) {
        if (num == 1) {
            return 2;
        }
        return 2 * recPow(num - 1);
    }

    static int pow(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * 2;
        }
        return sum;
    }

    public static void main(String args[]) {
        int a = recPow(10);
        System.out.println(a);
        int b = pow(10);
        System.out.println(b);
    }
}
