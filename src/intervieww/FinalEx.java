/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

/**
 *
 * @author Davidvilla
 */
public class FinalEx {

    final static int d = 10; // cannot be changed.

    final static void display() { // cannot be overridden. but can be inherited.
        nuthan a = new nuthan();
        a.c = 300;
        System.out.println(a.c);
        //d=200;
    }

    final static class nuthan {// to make immutable, cannot be exteded

        int c = 0;

        nuthan() {
        }
    }

    static class inher extends FinalEx {

        inher() {
        }
        //final static void display(){  }   
    }

    public static void main(String args[]) {
        // nuthan a= new nuthan();// declare class nuthan as static to access
        display();
        inher in = new inher();
        in.display();
        //a=200;
    }
    // class trial extends nuthan{}
}
