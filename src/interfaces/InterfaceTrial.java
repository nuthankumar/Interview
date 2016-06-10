package interfaces;

public class InterfaceTrial {
	public static void main(String args[]){
		ABC a =new ABC(){
			@Override
			public void dosomework() {
				System.out.println("helloooooo");
			}
		};
		a.dosomework();
	}
}
