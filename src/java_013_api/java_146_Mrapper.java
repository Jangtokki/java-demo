package java_013_api;

public class java_146_Mrapper {

	public static void main(String[] args) {

		//[출력결과]
		//숫자갯수:3

		String sn = "korea12 paran3";
		 int cnt = 0;
		 for (int i = 0; i < sn.length(); i++) {
			 char data = sn.charAt(i);
			 if(Character.isDigit(data))
				 cnt++;
		 }
		System.out.println("숫자갯수:"+cnt);
		
		//위와같음
		char[] line = sn.toCharArray();
		for(char data : line) {
			if(Character.isDigit(data))
				cnt++;
		}
		 
		
		
	}

}
