package statements;

public class Java_038_array {

	public static void main(String[] args) {
		
		int [] data = {10, 20, 30};
		
		//초기값을 할당하면서 배열을 생성할 때는 배열의 크기를 지정할 수 없다 new int[3]{90, 80, 40}; <=
		int [] jumsu = new int[] {90, 80, 40};
		
		for (int i=0; i<data.length; i++) {
			System.out.printf("jumsu[%d]=%d\n", i, jumsu[i]);
		}
		
		System.out.println("==========================");
		for(int i = jumsu.length-1; i>=0; i--) {
			System.out.printf("jumsu[%d]=%d\n", i, jumsu[i]);
		}
	}

}
