package intervieww;

class ABC {
	void method1(){
		System.out.println("helloo");
	}
}
public class Inheritance extends ABC{

	
	void method2(){
		System.out.println("helloo2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ABC obj=new Inheritance();
		Inheritance obj2=new Inheritance();
		//obj.method2(); //compile time error
		obj2.method2();
		Inheritance obj3=(Inheritance)new ABC();
		obj3.method2();

	}

}
