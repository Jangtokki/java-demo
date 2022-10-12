package java_006_class.part04;

/* [분식집 프로그램]
 * 1. 메뉴명
 * 2. 가격
 * 3. 주문개수
 * 4. 계산
 * 
 * 객체 속성 : 메뉴명, 가격, 주문개수
 * 객체 동작 : 계산하다.
 * 
 * 메뉴명		가격		주문개수
 * 떡볶이		2000		3
 * 김말이		500			2
 * 오뎅 		300			4
 */

public class MenuShop {

	String menu;
	int price;
	int cnt;
	
	int count() {
		return price * cnt;
	}
	
	void display() {
		System.out.println("메뉴명: " + menu);
		System.out.println("가격: " + price);
		System.out.println("주문개수: " + cnt);
		System.out.println("금액: " + count());
	}
	
}
