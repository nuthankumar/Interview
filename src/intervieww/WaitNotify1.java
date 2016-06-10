/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Davidvilla
 */
class WaitNotify1 {

    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) throws InterruptedException {
        System.out.println("going to deposit...");
        
       try{
           Thread.sleep(1000);
       }catch (Exception e){
           System.out.println(e); 
       }
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }
}

class Test {

    public static void main(String args[]) {
        final WaitNotify1 c = new WaitNotify1();
        Thread t = new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        };

        t.start();
        Thread t2 = new Thread() {
            public void run() {
                try {
                    c.deposit(10000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        t2.start();

    }
}