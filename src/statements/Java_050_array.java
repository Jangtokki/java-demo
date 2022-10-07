package statements;

public class Java_050_array {

	public static void main(String[] args) {
		
		int[][] num = new int [3][];
		num[0] = new int [2]; // 0행은 2열이 생성
		num[1] = new int [3]; // 1행은 3열이 생성
		num[2] = new int [5]; // 2행은 5열이 생성
		
		int[][] num2 = new int [][] {{1,2},{3,4,5},{6,7,8,9,10}};
		
		for(int i =0; i<num2.length; i++) {
			for(int j=0; j<num2[i].length; j++) {
				System.out.printf("%4d", num2[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
