package interviewProgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trial {

	public static void main(String[] args) {

		//asked in cisco gave wrong
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=-3;i<3;i++){
			al.add(i);
		}
		for(int i=0;i<3;i++){
			System.out.println(al.toString());
			al.remove(i);
		}
		System.out.println(al.toString());
		Iterator itor=al.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		
		for (Integer obj : al) {
            System.out.println(obj.intValue());
        }
	}

}
