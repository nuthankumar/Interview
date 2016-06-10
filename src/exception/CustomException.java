package exception;

@SuppressWarnings("serial")
public class CustomException extends Exception{
	
	CustomException(String s){
		super(s);
		System.out.println("please change ur number to greater than 10");
	}

}
