package exception;

public class AppException {

	static void testCustomException(int a) throws CustomException{
		if(a<=10){
			throw new CustomException("not valid");
		}
		else{
			System.out.println("you are right");
		}
	}
	public static void main(String[] args) throws CustomException {

		int a=11;
		AppException.testCustomException(a);
	}

}
