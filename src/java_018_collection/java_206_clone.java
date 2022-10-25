package java_018_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class java_206_clone {

	public static void main(String[] args) {
		Integer[] it = new Integer[] {3,5,2,4,7};
		
		ArrayList<Integer> sourceList = new ArrayList<Integer>(Arrays.asList(it));
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for(int i=0; i<aList.size(); i++) {
			aList.add(sourceList.get(i));
		}
		System.out.println("sourceList" + sourceList.toString());
		
		ArrayList<Integer> destList = (ArrayList<Integer>)sourceList.clone();
		System.out.println("destList"  + destList.toString()+ "\n");
		
		sourceList.sort(new Ascending());
		System.out.println("sourceList" + sourceList.toString());
		System.out.println("destList" + destList.toString());
		
		
		
	}

}
