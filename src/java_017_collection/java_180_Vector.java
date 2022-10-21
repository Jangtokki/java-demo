package java_017_collection;

import java.util.Vector;

public class java_180_Vector {

	public static void main(String[] args) {


		Vector<String> v = new Vector<String>();
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		
		//일반반복문
		for(int i=0; i<v.size(); i++) {
			String data = v.get(i);
			System.out.println(data);
		}
		
		//개선된 반복문
		//for(데이터타입 변수 : 배열 or 컬렉션) { }
		for(String data : v) {
			System.out.println(data);
		}
		
		//<Number> Integer, Double, Float 모두를 가져올수있음
		Vector<Number> vt = new Vector<Number>();
		vt.add(new Integer(10));
		vt.add(new Double(10.5) );
		vt.add(new Float(4.8f));
		
		for(Number ne : vt) {
			if(ne instanceof Integer) {
				Integer it =(Integer)ne;
				System.out.println(it);
			}else if(ne instanceof Double) {
				Double de = (Double)ne;
				System.out.println(de);
			}else if(ne instanceof Float) {
				Float ft = (Float)ne;
				System.out.println(ft);
			}
		}
		
		
		
	}

}
