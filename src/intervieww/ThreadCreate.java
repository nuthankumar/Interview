/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

/**
 *
 * @author Davidvilla
 */
public class ThreadCreate implements Runnable {

    @Override
    public void run() {

        if (Thread.currentThread().isDaemon()) {//checking for daemon thread  
            System.out.println("daemon thread work");
            // work for deamon, if needed to do anything while garbage collections
            
        } else {
            System.out.println("thread is running...");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    // Thread.sleep(400);  
                    Thread.yield();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public void finalize() {
        System.out.println("finalizeee is called");
    }

    public static void main(String args[]) throws InterruptedException {
        ThreadCreate t1 = new ThreadCreate();
        Thread t = new Thread(t1);
        Thread t2 = new Thread(t1, "nuthan");
        t.start();
        try {
            t.join(); /// remove and see the output
        } catch (Exception e) {
            System.out.println("pussyyyyyy");
        }
        t2.start();
        t.setName("hellloooo");
        System.out.println(t.getName());
        t2.getName();
        System.out.println(t2.getName());

        ThreadCreate tc = new ThreadCreate();

        tc = null; // finalize is called only when the resource is not refered to an object. 
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getStackTrace());
        
        System.gc();
    }
}
