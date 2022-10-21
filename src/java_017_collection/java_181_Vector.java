package java_017_collection;

import java.util.Vector;

public class java_181_Vector {

	public static void main(String[] args) {
		
		// 홍길동 30
		// 김영희 25
		
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("김영희", 25);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		Person[] ps = new Person[2];
		ps[0] = new Person("홍길동", 30);
		ps[1] = new Person("김영희", 25);
		
		for(Person pn : ps)
			System.out.println(pn.toString());
		
		System.out.println("===========================");
		
		Vector<Person> vt = new Vector<Person>();
		vt.add(new Person("홍길동", 30));
		vt.add(new Person("김영희", 25));
		for(Person pn : vt)
			System.out.println(pn.toString());
		
	}

}
