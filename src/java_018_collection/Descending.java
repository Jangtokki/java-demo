package java_018_collection;

import java.util.Comparator;

public class Descending implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);

	}
	
	
}
