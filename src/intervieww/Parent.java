package intervieww;

import java.util.ArrayList;

public class Parent {

	//Polymorphism
		public static void method1(){
			System.out.println("method 1");
		}
		public static void method1(ArrayList<String> a){
			System.out.println(a+"method 1");
		}
		public static void method2(){
			System.out.println("method 2");
		}
}
