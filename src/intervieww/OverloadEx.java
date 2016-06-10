/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

import java.util.ArrayList;

/**
 *
 * @author Davidvilla
 */
public class OverloadEx {
    
	//Polymorphism
	public static void method1(){
		System.out.println("method 1");
	}
	public static void method1(ArrayList<String> a){
		System.out.println(a+"method 1");
	}
	public static void main(String args[]){
		ArrayList<String> a=new ArrayList<String>();
		method1();
		method1(a);
	}
}
