/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class Fibbonacci {
    
    static void fib(int num){
        int n=1;
        int m=2;
        
        System.out.println(n);
        System.out.println(m);
        
        for(int i=2;i<=num;i++){
           int c=n+m;
            n=m;
            m=c;
            System.out.println(c);
        }
        
        
    }
    public static void main(String args[]){
        fib(10);
    }
    
}
