package java_007_class.part09.part01.copy;

/* 출력력과처럼 총합계까지 출력이 되도록 main()메소드에 
 * 로직을 추가하세요.
 * 
 * [출력결과]
 * 연평해전 14000
 * 극비수사 22500
 * 소수의견 14000
 * 총합계: 50500
 */


public class Prob01_class {

	public static void main(String[] args) {
		int sum = 0;
		MovieShop[] me = new MovieShop[3];
		me[0] = new MovieShop("연평해전", 7000, 2);
		me[1] = new MovieShop("극비수사", 7500, 3);
		me[2] = new MovieShop("소수의견", 7000, 2);

		
		
		System.out.println();
		// 여기에 구현하세요/////////////////
		int total = 0;
		int total2 =0;
		for(int i=0; i<me.length; i++) {
			total = me[i].person*me[i].price;
			System.out.printf("%s %d\n", me[i].name, total);
			total2 += me[i].person*me[i].price;
			//me[i].display();
		}System.out.printf("총합계 : %d", total2);
		
		
		
		
		//////////////////////////

	}// end main()
	

}// end class


