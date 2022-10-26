package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Sub> custom = new ArrayList<Sub>();
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("---------------------------------------------------------");
		System.out.println("| 1.상품등록 | 2.상품삭제 | 3.상품조회 | 4.재고현황 | 5.종료하기 |");
		System.out.println("---------------------------------------------------------");
		System.out.println("원하시는 서비스 번호를 입력하세요 : ");
		int sel = Integer.parseInt(sc.nextLine());
		if(sel==1) {
			System.out.println("===상품등록 페이지 입니다.===");
			System.out.println("아래 내용을 입력해주세요.");
			System.out.println("상품번호 : ");
			int number = sc.nextInt();
			System.out.println("상품명 : ");
			String title = sc.next();
			System.out.println("상품가격 : ");
			int price = sc.nextInt();
			System.out.println("수량 : ");
			int amount = sc.nextInt();
			Sub n = new Sub();
			n.setNumber(number);
			n.setTitle(title);
			n.setPrice(price);
			n.setAmount(amount);
			custom.add(n);
			
		}else if(sel==2){
			System.out.println("===상품삭제 페이지 입니다.===");
			System.out.println("삭제할 상품번호를 입력하세요.");
			System.out.println("상품번호 : ");
			int number = sc.nextInt();
			custom.remove(number);
			
		}else if(sel==5) {
			System.out.println("===프로그램 종료===");
			System.exit(0);
			
		}
		
		
		
	}

}
