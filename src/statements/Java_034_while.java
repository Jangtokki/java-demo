package statements;

/*
 * 
 * while(조건식) {
 * 
 * 		반복 수행문장
 * 
 * 		}
 * 
 * 	while문은 조건식을 생략할 수 없다.
 * 
 * 
 * 
 */
public class Java_034_while {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("====================");
		//////// for문을 while문으로 ////////////

		int i = 1;
		while (i <= 5) {
			System.out.println(i++);

			/////////////////////////////////////////

		}
		System.out.println("====================");

		int j = 0;
		while (++j <= 5) {
			System.out.println(j);
		}
		
		
		System.out.println("====================");
		
		int k = 0;
		while (k++ < 5) {
			System.out.println(k);
		}


	}

}
