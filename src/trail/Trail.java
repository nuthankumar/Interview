package trail;


import java.util.ArrayList;
import java.util.List;

public class Trail {
	
	
	public static ArrayList<String> method1(ArrayList<String> arr1,ArrayList<String> arr2){
		
		ArrayList<String> arr3=new ArrayList<String>();
		arr3.addAll(arr1);
		for(String obj:arr2){
			if(arr3.contains(obj)){
				
			}
			else{
				arr3.add(obj);
			}
		}
		return arr3;
	}

	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<String>();
		ArrayList<String> arr2=new ArrayList<String>();
		ArrayList<String> arr3=new ArrayList<String>();

		arr1.add("pallavi"); 
		arr1.add("nuthan");
		arr1.add("arpitha");
		
		arr2.add("mango"); 
		arr2.add("nuthan");
		arr2.add("hello");
		
		arr3=method1(arr1,arr2);
		for(String obj:arr3){
			System.out.println(obj);
		}
		
		
		
	}

}
