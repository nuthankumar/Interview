package intervieww;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  
		
		//Converting Integer to int    
		Integer a1=new Integer(3);    
		int i1=a1.intValue();//converting Integer to int  
		int j1=a1;//unboxing, now compiler will write a.intValue() internally    
		System.out.println(a1+" "+i1+" "+j1);    
		
		boolean	a2=true;
		Boolean a3=Boolean.valueOf(a2);
		Boolean a4=new Boolean(false);
		boolean a5=a4.booleanValue();
		char c1='a';
		Character c2=Character.valueOf(c1);
		Character c3=new Character('l');
		char c4=c3.charValue();
		
		short s1=2;
		Short s2=Short.valueOf(s1);
		Short s3=new Short("4");
		short s4=s3.shortValue();
		
		long l1=1000;
		Long l2=Long.valueOf(l1);
		Long l3=new Long("4");
		long l4=l3.longValue();
		
		float f1=5;	
		Float f2=Float.valueOf(f1);
		Float f3=new Float("4");
		float f4=f3.floatValue();
		
		double d2=34434.434;
		Double d5=Double.valueOf(d2);
		Double d3=new Double("4");
		double d4=d3.doubleValue();
		
	}

}
