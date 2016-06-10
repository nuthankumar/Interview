package interviewProgs;

public class App {

	public static void main(String[] args) {

		ImmutableClass it=new ImmutableClass("nuthan");
		String b="bc";
		String s=new String("bcd");
		System.out.println(s.hashCode());
		s=s.concat(b);
		//System.out.println(s.intern());
		System.out.println(s.hashCode());
		System.out.println(b.hashCode());
		s=it.getanyVariable();
		System.out.println(s.hashCode());
	}

}
