package java_007_class.part05;

public class java_078_class {

	public static void main(String[] args) {
		
		/*
		 * [출력결과]
		 * 기업은행 42523-52325 100000
		 * 하나은행 52253-22623 153000
		 * 신한은행 16239-95235 256000
		 * 납입액 : 509000
		 */
		
		CreditCard[] cc = new CreditCard[3];
		cc[0] = new CreditCard ("기업은행", "42523-52325", 100000);
		cc[1] = new CreditCard ("하나은행", "52253-22623", 153000);
		cc[2] = new CreditCard ("신한은행", "16239-95235", 256000);
		
		
		
		int total = 0;
		for (int i=0; i<cc.length; i++) {
			total += cc[i].pay;
			
		}
		
		System.out.printf("납입액 : %d", total);
		
	}

}
