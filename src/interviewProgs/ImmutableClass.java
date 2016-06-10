package interviewProgs;

public final class ImmutableClass {
		final String anyVariable;  
		//final String anyVariable2;
		  
		public ImmutableClass(final String anyVariable){  
		this.anyVariable=anyVariable;  
		//this.anyVariable2=anyVariable2;  
		}  
		 
		public String getanyVariable(){  
		//	System.out.println(anyVariable);
		return anyVariable;  
		} 
		
		public static void main(String args[]) throws CloneNotSupportedException{
			ImmutableClass a=new ImmutableClass("nuthan");
			//a.anyVariable="hello";
			a.getanyVariable();
			System.out.println(a);
			//
			ImmutableClass b =(ImmutableClass) a.clone();
			System.out.println(b);
		}
}


