/*package bt;

public class BT {
	class test
	{
	      private static int p = test();
	     
	      static int test()
	      {
	            return 99;
	      }
	      publicstaticvoid main(String args[])
	      {
	            System.out.println("^^^p:=>"+p);
	      }
	}

	Answer: 99

	 

	2)

	class Super
	{
	      void init(finallonga,longb)
	      {
	            System.out.println("Super");
	      } 
	}
	 
	class Test extends Super
	{
	      publicstaticvoid main(String args[])
	      {
	            Test object = new Test();
	            object.init(2,3);
	      }
	      void init(int... a)
	      {
	            System.out.println("Sub");
	      }
	}

	Answer: Super



	 

	3) Which all methods of Thread class are Static?

	Answer:

	·         static void yield()
	·         static void sleep(long millis, int nanos)
	·         static void sleep(long millis)
	·         static boolean interrupted()
	·         static boolean holdsLock(Object obj)
	·         static int enumerate(Thread[] tarray)
	·         static void dumpStack()
	·         static Thread currentThread()
	·         static int activeCount()
	·         static void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)
	·         static Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler()
	 
	 
	4) There is one question in which “wait()“ is called.
	Answer: 
	Invocation of this wait() method is not in a “Synchronized” Block or Method hence it will give error. Wait() method will always be called in “Synchronized” block or method.
	 
	 
	5) Select correct statement about Thread.sleep(milisec) method
	Answer:
	Read all about thread.sleep() method.
	Thread.sleep(milisec) will not release the lock.
	 
	 
	6)
	interface a
	{
	finalintx = 2;
	void abc();
	publicabstractstaticclass xyz
	     {
	     }
	}
	Above code is correct or not?
	Answer: Yes Correct and It will compile
	 
	 
	 
	 
	7) What are the different methods of Queue?
	Answer: poll(),peek(),remove(),add(),offer(),push()
	 
	 
	8) if o1.equals(o2) then o1.hashCode() == o2.hashCode()??
	Select Multiple Statements which are correct.
	Eg.
	class Test
	{
	      publicstaticvoid main(String[] args)
	      {
	            Test t1 = new Test(10);
	            Test t2 = new Test(10);
	            System.out.println(""+(t1.equals(t2)));
	            System.out.println(""+t1.hashCode());
	            System.out.println(""+t2.hashCode());
	      }
	      intindex;
	      Test(intindex){
	            this.index = index;     }
	     
	      @Override
	      publicboolean equals(Object obj) {
	            if(objinstanceof Test)
	{
	                  return ((Test)obj).index == this.index;
	            }
	            returnfalse;
	      }
	     
	      @Override
	      publicinthashCode() {
	            returnindex * 11;
	      }
	}
	 
	 
	9)
	class abc
	{
	public static void main (String args[])
	{
	sop(“1”);
	try
	{
	return;
	}
	catch(Exception ex)
	{
	             System.out.println(“something”);
	}
	finally
	{
	sop(“2”);
	}
	sop(“3”);
	}
	}
	Output: 1 2
	 
	10)Select multiple correct statement about interface.
	Answer: Some Statements
	Ø  All methods are implicitly abstract in interface
	Ø  Data member must be constant (i.e public static final )
	Ø  We can implement abstract class in interface
	 
	 
	11)
	Stringstmnt = "java 2015";
	String[] arr = stmnt.split(" ");
	try
	{
	inti = Integer.parseInt(arr[1]);
	    System.out.println(i);
	}
	catch(Exception ex)
	{
	      System.out.println("something");
	}
	finally
	{
	      System.out.println("finally");
	}
	Output:
	2015
	finally
	 
	 
	 
	 
	 
	 
	 
	 
	12)
	class Test
	{
	void call (Long x , Long y)    // L capital
	     {
	       System.out.println("something1");
	     }
	void call (int... x)
	     {
	       System.out.println("something2");
	     }
	 
	publicstaticvoid main(String arg[])
	     {
	      Test a = new Test();
	intval=3;
	a.call (val,val);
	     }
	}
	Output: something2 // When L is capital
	        Something1 // When l is small
	 
	 
	 
	13)How to get Lock? Select multiple correct statements.
	Answers:
	Ø  By wait(),
	Ø  By calling objects synchronous method,
	Ø  By synchronized block
	 
	 
	14)
	public class Test1 extends Thread
	{
	      public static void main (String args[])
	{
	Runnable c = new Test1();
	Thread t = new Thread(c);
	t.start(); // or t.run() don’t know exactly 
	      }                                     
	public void run()
	{
	           System.out.print("something");
	      }                                     
	Output: something
	 
	 
	15)PARENT CLASS REFERENCE REFERRING TO CHILD OBJECT (Multiple questions on this Concepts)
	Eg.  Parent p = new Child();
	     p.testMethod();
	 
	class Parent
	{
	      publicvoid testMethod()
	      {
	            System.out.println("Inside Parent Classs");
	      }
	}
	class Test extends Parent
	{
	      publicstaticvoid main(String[] args)
	      {
	            Parent p = new Test();
	            p.testMethod();
	      }
	      publicvoid testMethod()
	      {
	            System.out.println("Inside Child Classs");
	      }
	}
	 
	Ø  testMethod() should present in Parent or Not? ->it should Present.If it is not then program will not compile.
	Ø  if Present in both class what will happen?->if present then compiler will call child class’s testMethod();
	 
	 
	16) Select all the valid declaration for interface.
	Answer:
	1.
	interface Test
	{
	    public int a = 100;
	    public void test() throws RuntimeException;
	}
	 
	2.
	abstract interface Test
	{
	    public int a = 100;
	    public void test() throws RuntimeException;
	}
	 
	 
	3.interface Test
	{
	    public int a = 100;
	    public void test();
	}
	Some more options are there. All the above are valid declaration.
	 
	 
	17)
	class Tyre
	{
	publicvoid front() throws RuntimeException
	    {
	        System.out.println("Tire");
	    }
	publicvoid front(longa)
	    {
	        System.out.println("Radial Tire with long");
	    }
	}
	 
	class RadialTyre extends Tyre
	{
	publicvoid front()
	    {
	        System.out.println("Radial Tire");
	    }
	publicvoid front(inta) throws RuntimeException
	    {
	        System.out.println("Radial Tire with int");
	    }
	}
	 
	class Test
	{
	      publicstaticvoid main(String... args)
	      {
	              Tyre t = new RadialTyre();
	      inta = 10;
	      t.front(a);
	      }
	}
	 
	Answers:
	1. Radial Tyre Radial Tire with long
	2. Radial Tyre Radial Tire with int
	3. Tire Radial Tire with long
	4. Tire Radial Tire with int
	 
	18)
	class Tyre
	{
	publicvoid front() throws RuntimeException
	    {
	        System.out.println("Tire");
	    }
	publicvoid front(longa)
	    {
	        System.out.println("Radial Tire with long");
	    }
	}
	class RadialTyre extends Tyre
	{
	publicvoid front()
	    {
	        System.out.println("Radial Tire");
	    }
	publicvoid front(inta) throws RuntimeException
	    {
	        System.out.println("Radial Tire with int");
	    }
	}
	class Test
	{
	      publicstaticvoid main(String... args)
	      {
	        System.out.println("This is just a test");
	        Tyre t = new RadialTyre();
	        Tyre t1 = new Tyre();
	        RadialTyre r = new RadialTyre();
	 
	        System.out.println(Tyreinstanceoft1);      //Line 1
	        System.out.println(t1instanceof RadialTyre);        //Line 2
	        System.out.println(Tyreinstanceofr);        //Line 3
	        System.out.println(rinstanceof RadialTyre);        //Line 4
	      }
	}
	 
	Answer:
	1. True False True True
	2. False False True True
	3. True True True True
	4. Compile Time error at line 1 and 3
	5. Compile Timer error at line 2 and 4
	 
	 
	 
	 
	19)
	public static void main(String... args)
	{
	        Set<node> nodeSet = new HashSet<node>();
	        nodeSet.add(new Node(10));
	        nodeSet.add(new Node(20));
	        nodeSet.add(new Node(30));
	        nodeSet.add(new Node(10));
	        nodeSet.add(new Node(20));
	 
	        System.out.println(nodeSet.size());
	}
	 
	Answer: (3 possible answers)
	1. 5 //This is when Node class does not implement Java hashCode()-Equals() contract
	2. 3 //This is when Node class implements Java hashCode()-Equals() contract
	3. Compile Time Error.//because Class Node is not defined.
	4. RunTimeException
	 
	 
	20)
	class Test
	{
	      publicstaticvoid main(String[] args)
	      {
	      Listlist = newArrayList();
	      list.add(new Node(10));
	      list.add(new String("Harsh"));
	     
	              System.out.println(list.get(1));
	      }
	}
	Answer:
	1. 10    
	2. Harsh
	3. CompileTimeError    
	4. CastClassException
}
*/