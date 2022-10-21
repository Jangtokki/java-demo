package java_017_collection;

public class java_179_Vector {

	public static void main(String[] args) {

		UserList uList = new UserList();
		uList.add(10);
		uList.add(20);
		uList.add(30);
		uList.add(40);
	
		
		System.out.println(uList.size());
		
		Integer it1 = (Integer)uList.get(0);
		System.out.println(it1.intValue());
		
		try {
		System.out.println(uList.get(0));
		System.out.println(uList.get(1));
		System.out.println(uList.get(2));
		System.out.println(uList.get(3));
		System.out.println(uList.get(4));
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println(uList.remove(0));
		System.out.println(uList.get(0));
		System.out.println(uList.size());
		
		
		
		
	}

}
