/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class MissingNumber {

    static int missing(int arr[]) {

        int n = 0;
        int arr1[] = new int[arr.length + 1];
        //  System.out.println(arr.length + 1);
        for (int i = 0; i <= arr.length - 1; i++) {
            arr1[arr[i] - 1] = 1;
        }
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == 0) {
                n = i + 1;
            }
        }

        return n;

    }

    public static void main(String args[]) {
        int arr[] = {5, 9, 6, 3, 8, 2, 1, 4};
        int n = missing(arr);
        System.out.println(n);
    }
}
