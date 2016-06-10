/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class Factorial {

    static int recFact(int num) {
        if(num==1){
            return 1;
        }
        
        return num*recFact(num-1);

    }

    static void Fact(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

    }

    public static void main(String args[]) {
       int a= recFact(5);
        Fact(5);
        System.out.println(a);
    }
}
