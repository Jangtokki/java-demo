package java_018_collection;

public class java_198_User {

	public static void main(String[] args) {
		
		
		Integer[] it = new Integer[] {1,5,3,2};
		Average<Integer> av = new Average<Integer>(it);
		System.out.println(av.findAverage());
		
		
		Number[] nb = new Number[] {2,5.3f,4.5};
		Average<Number> ae = new Average<Number>(nb);
		System.out.println(ae.findAverage());
		
		String[]sn = new String[] {"java","jsp"};
		//Average<String> sn = new Average<String>();
	}

}
