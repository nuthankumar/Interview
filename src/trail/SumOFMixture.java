/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
public class SumOFMixture {

    static int method(String s) {
        String s2 = s.replaceAll("[^0-9]", "");
        //String s2 = s.replaceAll("[^0-9]", " ");
        String[] split = s2.split(" ");
        System.out.println(s2);
        int arr[] = new int[s2.length()];
        int n = 0;

        for (int i = 0; i < s2.length(); i++) {
            // arr[i] = (int)(s2.charAt(i));
            arr[i] = Integer.valueOf(s2.substring(i, i+1));

            System.out.println(arr[i]);

        }
//        for (int i = 0; i <  split.length; i++) {
//            arr[i] = Integer.parseInt( split[i].trim());
//            System.out.println(arr[i]);
//
//        }


        for (int i = 0; i < arr.length; i++) {
            n += arr[i];

        }




        return n;
    }

    public static void main(String args[]) {
        String s = "2nu2th4a5n";
        
        int a = method(s);
        System.out.println(a);



    }
}
