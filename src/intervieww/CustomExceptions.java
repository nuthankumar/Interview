/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

/**
 *
 * @author Davidvilla
 */
class InvalidAgeException extends Exception {

    InvalidAgeException(String s) {
        super(s);
    }
}

 class CustomExceptions {

      void validate(int age) throws InvalidAgeException {
        // void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("not valid");
           
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]) {
        try {
            CustomExceptions a=new CustomExceptions();
                a.validate(13);
           // CustomExceptions.validate(13);
           // validate(13);
        } catch (InvalidAgeException m) {
            System.out.println("Exception occured: " + m);
        }catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }

        System.out.println("rest of the code...");
    }
}
