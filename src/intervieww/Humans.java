/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;
/**
 *
 * @author Davidvilla
 */
public class Humans {
	int age;
	String name;
	String gender;
	
	public void talk(){
		System.out.println("hello");
	}
	Humans(int age,String name,String gender){
		this.age=age;
		this.name=name;
		this.gender=gender;
	}
	public static void main(String args[]){
		
		Humans pallavi=new Humans(23,"pallavi","female");
		Humans Nuthan=new Humans(26,"nuthan","male");
		pallavi.talk();
		Nuthan.talk();
		
	}
	
}
