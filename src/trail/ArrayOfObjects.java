/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
class Books {

    String title;
    String author;
}

class ArrayOfObjects {

    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0]=new Books();
        myBooks[1]=new Books();
        myBooks[2]=new Books();
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "he Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        while (x < 2) {
            System.out.print(myBooks[x].title);
            System.out.print("by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }

//
//class Hobbits {
//
//    String name;
//
//    public static void main(String[] args) {
//        Hobbits[] h = new Hobbits[3];
//        int z = 0;
//        while (z < 2) {
//            z = z + 1;
//            h[z] = new Hobbits();
//            h[z].name = "bilbo";
//            if (z == 1) {
//                h[z].name = "frodo";
//            }
//            if (z == 2) {
//                h[z].name = "sam";
//            }
//            System.out.print(h[z].name + "is a");
//            System.out.println("good Hobbit name");
//        }
//    }
//}

 public void go() {
 String o = "";
 z:
 for(int x = 0; x < 3; x++) {
 for(int y = 0; y < 2; y++) {
 if(x==1) break;
 if(x==2 && y==1) break z;
 o = o + x + y;
 }
 }
 System.out.println(o);
}
 }

