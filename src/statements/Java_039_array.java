package statements;

//num 배열에 저장된 요소의 합계를 구하는 프로그램 구현
public class Java_039_array {

	public static void main(String[] args) {
		int[] num = new int [] {22, 3, 8, 12};
		int sum =0;
		
		/*
		sum = sum +num[0]; // 0 + 22 = 22
		sum = sum +num[1]; // 22 + 3 = 25
		sum = sum +num[2]; // 25 + 8 = 33
		sum = sum +num[3]; // 33 + 12 = 45
		*/
		
		for(int i = 0; i < num.length-1; i++) {
			sum = sum + num[i];
			
		}
		
		System.out.println("합계:" + sum);
		
	}

}
