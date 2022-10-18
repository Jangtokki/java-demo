package java_012_api;

public class java_116_String {

	public static void main(String[] args) {
		
		String sn = "java";
		String sg = "java";
		
		String st = new String("java");
		String ss = new String("java");
		
		//주소비교
		System.out.printf("sn==sg:%b\n", sn==sg); //true
		System.out.printf("st==ss:%b\n", st==ss); //false
		
		//메모리에 저장된 문자열비교
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg)); //true
		System.out.printf("sn.equals(ss):%b\n", sn.equals(ss)); //true
		//st.equalsIgnoreCase(st) : 대소문자 구분 안함
		//st.equals(st) : 대소문자 구분
		
		//메모리에 저장된 문자열 리턴
		System.out.println(sn.toString());
		System.out.println(sn);
		
	}

}
