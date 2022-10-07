package statements;

public class Java_040_array {

	public static void main(String[] args) {
		
		int[] num = new int [] {22, 3, 8, 12};
		int odd = 0;
		int even = 0;
		
		//출력결과
		//홀수 : 3
		//짝수 : 42
		
		for (int i=0; i<num.length; i++) {
			if(num[i]%2==1) {odd = odd + num[i];}
			else even = even + num[i];
		}
		System.out.printf("홀수: %d\n짝수: %d", odd, even);
	}

}
