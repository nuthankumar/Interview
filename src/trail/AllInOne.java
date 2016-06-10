/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trail;

/**
 *
 * @author Davidvilla
 */
interface A{
    void method1();
}
interface C{
    void method2();
    
}
interface M extends A,C{
    void method2();
    
}
 class B implements A,C{
   public  void method1(){
       System.out.println("abstract method1");
   }

    @Override
    public void method2() {
         System.out.println("abstract method2");
    }
}

class D extends B implements A,C{

    @Override
    public void method2() {
        System.out.println("class D method2");
    }
    @Override
    public void method1() {
        System.out.println("class D method1");
    }
    public static void main(String args[]){
        A a=new D();
        D c=new D();
        B b= new B();
        b.method1();
        b.method2();
        a.method1();
        c.method1();
        c.method2();
    }
    
}