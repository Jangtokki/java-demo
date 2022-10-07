package statements;

public class Java_048_array {

	public static void main(String[] args) {
		
			int[][] num = { { 1, 2, 3, 4, 5 }, 
					{ 6, 7, 8, 9, 10 }, 
					{ 11, 12, 13, 14, 15 }, 
					{ 16, 17, 18, 19, 20 } };
					
			for(int i =0; i<num.length; i++){
				if(i%2==1) {for(int k=4;k>=0; k--) {
						System.out.printf("%4d", num[i][k]);
					}} else {
				for(int j=0; j<num[i].length; j++) {
					System.out.printf("%4d", num[i][j]);
					}
							}
				System.out.println();		
	}
			
	}

}
