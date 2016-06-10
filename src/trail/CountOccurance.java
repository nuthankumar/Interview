/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

import java.util.Random;

/**
 *
 * @author Davidvilla
 */
public class CountOccurance {

    /*Random randomGenerator = new Random();
     int arr[];

     void Gen() {
     for (int i = 0; i < 10; i++) {
     int randomInt = randomGenerator.nextInt(100);
     arr[i] = randomInt;
     System.out.println(arr[i]);
     }
     }
     */
    static int[] method(int arr[]) {
        final int arr1[]= new int[9];
        
        //int arr1[] = new int[9];
       // arr1[].clone();//arr[];
        int n1 = 0,n2 = 0,n3 = 0,n4 = 0,n5 = 0,n6 = 0,n7 = 0,n8 = 0,n9 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            switch (arr[i]) {
                case 1:n1++;
                    break;
                case 2:n2++;
                    break;
                case 3:n3++;
                    break;
                case 4:n4++;
                    break;
                case 5:n5++;
                    break;
                case 6:n6++;
                    break;
                case 7:n7++;
                    break;
                case 8:n8++;
                    break;
                case 9:n9++;
                    break;

            }
        }
        arr1[0]=n1;
        arr1[1]=n2;
        arr1[2]=n3;
        arr1[3]=n4;
        arr1[4]=n5;
        arr1[5]=n6;
        arr1[6]=n7;
        arr1[7]=n8;
        arr1[8]=n9;
        
        
        
        return arr1;
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {

       // int arr[] = {1, 2, 3, 2, 2, 5, 3, 5, 6, 7, 4, 6, 7, 4, 3, 2, 7, 8, 9, 8, 9, 5, 3, 4, 6, 8, 9, 4, 2, 4, 7, 3, 2, 6, 7, 4, 3, 2, 5, 8, 9, 4, 5, 8, 9, 4, 3, 2};
       int arr[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9};
        int arr1[] = method(arr);
        display(arr);
         System.out.println("hellooo");
         display(arr1);

    }
}
