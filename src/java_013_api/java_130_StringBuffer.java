package java_013_api;

public class java_130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		sb.insert(4 , ", jsp"); //java, jsp test
		System.out.println(sb);
		
		sb.delete(4, 9); //java test
		System.out.println(sb);
		
		sb.append(" start"); //java test start
		System.out.println(sb);
		
		sb.reverse(); //trats tset avaj
		System.out.println(sb);
		
		String data = "mybatis orm";
		StringBuffer sf  = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		System.out.println(data);
		String re = sf.toString();
		System.out.println(re);
		
		//char [] -> String - > StringBuffer
		char[] arr = {'k', 'o', 'r', 'e', 'a'};
		String sp = String.valueOf(arr);
		StringBuffer se = new StringBuffer(sp);
		//StringBuffer sr = new StringBuffer();
		//se.append(sp);
		se.reverse();
		System.out.println(se);
		
		System.out.println(new StringBuffer(String.valueOf(arr)).reverse());
		
		String st = se.toString();
		System.out.println(st);
		
		char[] val = st.toCharArray();
		System.out.println(val);
		
		System.out.println(se.toString().toCharArray());
		
		
		
	}

}
