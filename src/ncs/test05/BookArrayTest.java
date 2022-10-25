package ncs.test05;

public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray[] = new Book[3];
		// Book 객체를 3개 생성하여 배열에 넣는다.
		// 배열에 있는 객체 정보를 모두 getter 로 출력 한다. – for 문을 이용 할 것
		// 실행 결과와 같이 계산 출력

		/*
		 * 자바의 정석, 남궁성, 도우출판, 30000원, 10% 할인 할인된 가격 : 27000원 열혈강의 자바, 구정은, 29000원, 10%
		 * 할인 할인된 가격 : 261000원 객체지향 JAVA8, 금영욱, 30000원, 10% 할인 할인된 가격 : 27000원
		 * 
		 */
		bArray[0] = new Book("자바의정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프라렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);

		for (int i = 0; i < bArray.length; i++) {

			System.out.printf("%s, %s, %d원, %s, %.0f%% 할인\n할인된 가격 : %.0f원\n", bArray[i].getTitle(), bArray[i].author,
					bArray[i].price, bArray[i].publisher, (bArray[i].discountRate * 100), (bArray[i].price-bArray[i].price*bArray[i].discountRate));
		}

	}

}
