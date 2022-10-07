package statements;

public class Java_045_array {

	public static void main(String[] args) {
		
		String[] name = {"홍길동", "이영희"};
		int [][] jumsu = {{90,95,40},{100,35,75}};
		
		/*
		 * 출력결과 
		 * 홍길동 90 95 40 215 71.5
		 * 이영희 100 35 75 210 70.0
		 * 
		 */
		
		int sum;
		for(int i=0; i<name.length; i++) {
			System.out.printf("%8s", name[i]);
			
			sum =0;
			for(int j=0; j<3; j++) {
				System.out.printf("%4d", jumsu[i][j]);
				sum += jumsu[i][j];
			}
			System.out.printf("%4d %6.1f\n", sum, (double)sum/3);
		}
		
	
		
		
		
		
		
	}

}
