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
class Table {

 // void printTable(int n) {//method not synchronized  
 /*  synchronized void printTable(int n) {//synchronized  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}*/
void printTable(int n) {//method not synchronized  
 synchronized(this) {//synchronized  block
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
}
class MyThread1 extends Thread {

    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
};

class MyThread2 extends Thread {

    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
};

class Sync {

    public static void main(String args[]) throws InterruptedException {
        Table obj = new Table();//only one object  
        MyThread1 t1 = new MyThread1(obj);
       
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        //t1.join();
        t1.interrupt();
        t2.start();
    }
}
