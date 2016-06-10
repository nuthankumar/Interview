package interviewProgs;

import java.util.Arrays;

public class MissingNumber{

	//method 1 by formula
	static int findMissingNum2(int arr[]){
		int a=(10*(10-1))/2;
		int b=0;
		for(int i=0;i<=arr.length-1;i++){
			b+=arr[i];
		}
		int c=a-b;
		return c;
	}
	// method 2 efficient
	static int findMissingNum(int arr[]){
		int b=0;
		Arrays.sort(arr);
		for(int i=0;i<9;i++){
			if(arr[i]==i){
			}
			else{
				b=i;
				break;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,7,8,9,0,4};
		int a = MissingNumber.findMissingNum(arr);
		int b =  MissingNumber.findMissingNum2(arr);
		//System.out.println(a);
		System.out.println(b);
	}

}
