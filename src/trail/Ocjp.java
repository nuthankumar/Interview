/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */


//class WrappedString {
//
//    private String s;
//
//    public WrappedString(String s) {
//        this.s = s;
//    }
//
//    public static void main(String[] args) {
//        HashSet<Object> hs = new HashSet<Object>();
//        WrappedString ws1 = new WrappedString("aardvark");
//        WrappedString ws2 = new WrappedString("aardvark");
//        String s1 = new String("aardvark");
//        String s2 = new String("aardvark");
//        hs.add(ws1);
//        hs.add(ws2);
//        hs.add(s1);
//        hs.add(s2);
//        System.out.println(hs.size());
//    }
//}
//import java.util.*;
//
//class Mapit {
//
//    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<Integer>();
//        Integer i1 = 45;
//        Integer i2 = 46;
//        set.add(i1);
//        set.add(i1);
//        set.add(i2);
//        
//        System.out.print(set.size() + " ");
//        set.remove(i1);
//        System.out.print(set.size() + " ");
//        
//        i2 = 47;
////        /set.add(i2);
//        set.remove(i2);
//        System.out.print(set.size() + " ");
//    }
//}
//class Explorer1 {
//
//    public static void main(String[] args) {
//        TreeSet<Integer> s = new TreeSet<Integer>();
//        TreeSet<Integer> subs = new TreeSet<Integer>();
//        for (int i = 606; i < 613; i++) {
//            if (i % 2 == 0) {
//                s.add(i);
//            }
//        }
//
//        subs = (TreeSet) s.subSet(608, false, 611, false);
//        s.add(609);
//        s.add(611);
//        System.out.println(s + " " + subs);
//    }
//}
//class Quest {
//
//    public static void main(String[] args) {
//        String[] colors = {"blue", "red", "green", "yellow", "orange"};
//        Arrays.sort(colors);
//        int s2 = Arrays.binarySearch(colors, "orange");
//        int s3 = Arrays.binarySearch(colors, "z");
//        System.out.println(s2 + " " + s3);
//    }
//}
//class A {
//
//    public static void main(String args[]) {
//        Runnable r = new Runnable() {
//            public void run() {
//                System.out.print("Cat");
//            }
//        };
//        Thread t = new Thread(r) {
////            public void run() {
////                System.out.print("Dog");
////            }
//        };
//
//
//        t.start();
//        r.run();
//    }
//}
//class PingPong2 {
//
//    synchronized void hit(long n) {
//        for (int i = 1; i < 3; i++) {
//            System.out.print(n + "-" + i + " ");
//        }
//    }
//}
//
//class Tester implements Runnable {
//
//    static PingPong2 pp2 = new PingPong2();
//
//    public static void main(String[] args) {
//        new Thread(new Tester()).start();
//        new Thread(new Tester()).start();
//    }
//
//    public void run() {
//        pp2.hit(Thread.currentThread().getId());
//    }
//}
//class Mud {
//
//    public static void main(String...a) {//
//    //public static void main(String... a) {//
//   // public static void main(String[]... a) {//
//        
//   // public static void main(String.* a) {
//   // public static void main(String...[] a) {
//        System.out.println("hi");
//    }
//}
//class Boxer1 {
//
//    Integer i;
//    int x;
//
//    public Boxer1(int y) {
//        x = i + y;
//        System.out.println(x);
//    }
//
//    public static void main(String[] args) {
//        new Boxer1(new Integer(4));
//    }
//}

//class Foo {
//public int a = 3;
//public void addFive() { a += 10; System.out.print("f "); }
//}
// class Bar extends Foo {
// public int a = 8;
// public void addFive() { this.a += 4; System.out.print("b " ); }
// 
// public static void main(String[] args) {
//Foo f = new Bar();
//f.addFive();
//System.out.println(f.a);
// }
// }


//class Thingy { 
//    Meter m = new Meter();
//}
//class Component { 
//    void go() { System.out.print("c"); }
//}
//class Meter extends Component { 
//    void go() { System.out.print("m"); } 
//}
// class DeluxeThingy extends Thingy {
// public static void main(String[] args) {
// DeluxeThingy dt = new DeluxeThingy();
// dt.m.go();
// Thingy t = new DeluxeThingy();
// t.m.go();
//}
//}

//import java.util.*;
// class GetInLine {
// public static void main(String[] args) {
//PriorityQueue<String> pq = new PriorityQueue<String>();
//pq.add("pear");
// pq.add("apple"); 
//pq.add("banana");
// System.out.println(pq.size());
//System.out.println(pq.poll() + " " +" " +pq.poll()+" "+ pq.peek());
//System.out.println(pq.size());
// }
//}


// class XMLMessage {
// //String getText() { return "<msg>text</msg>";}
// public static void main(String[] args) {
//     String csv = "Sue,5,true,3";
// Scanner scanner = new Scanner(csv);
// scanner.useDelimiter(",");
// int age = scanner.nextint();
// }
// }

// class Plant {
//private String name;
// //Plant() {  }
//public Plant(String name) { this.name = name; }
//public String getName() { return name; }
//}
// class Tree extends Plant {
//public void growFruit() { }
//public void dropLeaves() { }
// }


// class Yikes {
//
//public static void go(Long n) {System.out.print("Long ");}
// public static void go(Short n) {System.out.print("Short ");}
// public static void go(Integer n) {System.out.print("int ");}
// public static void main(String [] args) {
//short y = 6;
// long z = 7;
// go(y);
// go(z);
// }
// }

// abstract class A {
// abstract void a1();
// protected void a2() { }
// }
// class B extends A {
// public void a1() { }
// public void a2() { }
// }
// class C extends B { protected void c1() { } } 
//class  D{
//public static void main(String [] args) {
//A x = new B(); C y = new C(); A z = new C();
// x.a2();
//z.a2();
//
//z.a1();
//y.c1();
//x.a1();
//System.out.print(Math.E+ " "+ Math.PI);
//}
//}

//class A {
// void foo() throws Exception { throw new Exception(); }
// }
// class SubB2 extends A {
//void foo() { System.out.println("B "); }
// }
// class Tester {
// public static void main(String[] args) throws Exception {
// A a = new SubB2();
// a.foo(); 
//  }
// }
//
// class Test {
// public enum Dogs {collie, harrier, shepherd};
// public static void main(String [] args) {
// Dogs myDog = Dogs.harrier;
// switch (myDog) {
// case collie:
// System.out.print("collie ");
// 
// case harrier:
// System.out.print("harrier ");
//      default:
// System.out.print("retriever ");
//}
// }
// }

 
//interface DeclareStuff {
//public static final int EASY = 3;
// void doStuff(int t); }
//  class TestDeclare implements DeclareStuff {
//public static void main(String [] args) {
// int x = 5;
// new TestDeclare().doStuff(++x);
// }
//     
//
//
// public void doStuff(int s) {
//s += EASY + ++s;
// System.out.println("s " + s);
// }
// }
// class Spock {
// public static void main(String[] args) {
//Long tail = 2000L;
//Long distance = 1999L;
//Long story = 1000L;
// if((tail < distance) ^ ((story * 2) == tail)) {
//         System.out.print("1");
//     }
//if((distance + 1 != tail) ^ ((story * 2) == distance)) {
//         System.out.print("2");
//     }
// }
// }

//168,60,99



