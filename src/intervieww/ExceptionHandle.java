/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

/**
 *
 * @author Davidvilla
 */
public class ExceptionHandle {

    static void validate(int age) {
        if (age < 18) {
            System.out.println("you cant vote");
            throw new ArithmeticException("not valid");
            //The Java throw keyword is used to explicitly throw an exception.
            //We can throw either checked or uncheked exception in java by throw keyword.
            //The throw keyword is mainly used to throw custom exception.

        } // only when needed in a method
        else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]) throws Exception {
        ExceptionHandle.validate(13);
        try {
            int data = 50 / 0;
            //throw new ArithmeticException("do not divide by zero");

            try {
                int a[] = new int[5];
                a[6] = 30 / 4;
            } catch (ArrayIndexOutOfBoundsException e) {// remember the sequence
                System.out.println("Array Exception" + e);
            }
            //throw new ArrayIndexOutOfBoundsException("check array");

        }//may throw exception 
        catch (ArrayIndexOutOfBoundsException e) {// remember the sequence
            System.out.println("Array Exception" + e);
        } catch (ArithmeticException e1) {
            System.out.println("divide by 0 Exception" + e1);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        } finally {
            System.out.println("finally");
        }
    }
}
