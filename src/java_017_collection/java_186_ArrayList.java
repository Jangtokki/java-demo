package java_017_collection;

import java.util.ArrayList;

public class java_186_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		String[] arr = display(aList);
		for(String data : arr)
			System.out.println(data);
		
	}
	
	public static String[] display(ArrayList<String> aList) {
		
	//	String[] stn = new String[aList.size()];		방법1
		
//		for(int i =0; i<stn.length; i++) {
//			stn[i] = aList.get(i);
//		}
		
//		String[] stn = new String[aList.size()];		방법2
//		return aList.toArray(stn);
//
		
		return aList.toArray(new String[aList.size()]);
	}

}
