/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class TransposeMatrix {

    public static int[][] method(int[][] arr,int m) {

        int transpose[][] = new int[m][m];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;

    }
    static void display(int[][] arr)
    {
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
            }
           System.out.println(); 
        }
    }
    public static void main(String args[]) {
       // int arr3[][] = new int[3][3];
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr1[][] = method(arr,3);
        display(arr);
        System.out.println("break");
        display(arr1);
    }
}
