/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

import java.util.Scanner;

/**
 *
 * @author Davidvilla
 */
public class SecondLargest {

    static int low = 0;
    static int high2 = 0;

    static int secondLargest(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > low){
                high2 = low;
                low = arr[i];


            } else if (arr[i] > high2) {
               // low = arr[i];
            }
        }
        
        return high2;
    }

    public static void main(String args[]) {

        int arr[] = {1, 4, 6, 5, 7, 8, 9, 3};
        int number = secondLargest(arr);
        System.out.println(number);

    }
}
