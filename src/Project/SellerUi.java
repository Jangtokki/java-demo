package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class SellerUi {
	ArrayList<Product> product = new ArrayList<Product>();
	Scanner sc = new Scanner(System.in);

	int sel0, sel;

	public void introPage() {

		while (true) {
			System.out.println("관리자 비밀번호를 입력하세요.");
			System.out.println("↓ 입력 ↓ ");
			int sel0 = sc.nextInt();
			if (sel0 != 0) {
				mainPage();
			} else {
				System.out.println("===프로그램 종료===");
				System.exit(0);
			}
		}
	}

	public void mainPage() {
		do {
			System.out.println("-------------------------------------------------------");
			System.out.println("| 1.상품등록 | 2.상품삭제 | 3.상품조회 | 4.재고현황 | 5.종료하기 |");
			System.out.println("-------------------------------------------------------");
			System.out.println("↓ 원하시는 서비스 번호를 입력하세요 ↓");
			sel = Integer.parseInt(sc.next());

			if (sel == 1) {
				System.out.println("===상품등록 페이지 입니다.===");
				System.out.println("아래 내용을 입력해주세요.");
				System.out.println("↓ 상품번호 ↓");
				String number = sc.next();
				System.out.println("↓ 상품명 ↓");
				String title = sc.next();
				System.out.println("↓ 상품가격 ↓");
				int price = sc.nextInt();
				System.out.println("↓ 수량 ↓");
				int amount = sc.nextInt();
				Product n = new Product();
				n.setNumber(number);
				n.setTitle(title);
				n.setPrice(price);
				n.setAmount(amount);
				product.add(n);
				System.out.println(number + " 상품이 정상적으로 등록되었습니다.");
			}

			else if (sel == 2) {
				System.out.println("===상품삭제 페이지 입니다.===");
				System.out.println("삭제할 상품번호를 입력하세요.");
				System.out.println("↓ 상품번호 ↓");
				String number = sc.next();
				boolean noneResult = false;
				for (int i = 0; i < product.size(); i++) {
					Product n = product.get(i);
					boolean chk = n.getNumber().equals(number);
					if (chk) {
						noneResult = true;
						product.remove(i);
						System.out.println(number + " 상품이 정상적으로 삭제 처리되었습니다.");
						break;
					}}
					if (!noneResult) {
						System.out.println("상품정보를 찾을 수 없습니다.");
					}
				

			}

			else if (sel == 3) {
				System.out.println("===상품조회 페이지 입니다.===");
				System.out.println("조회할 상품번호를 입력하세요.");
				System.out.println("↓ 상품번호 ↓");
				String number = sc.next();
				boolean noneResult = false;
				for (int i = 0; i < product.size(); i++) {
					Product n = product.get(i);
					boolean chk = n.getNumber().equals(number);
					if (chk) {
						noneResult = true;
						System.out.println("=========================================");
						System.out.printf("상품번호 : %s\n상품명 : %s\n상품가격 : %d\n수량 : %d\n", n.getNumber(), n.getTitle(),
								n.getPrice(), n.getAmount());
						System.out.println("=========================================");
						break;
					}}

					if (!noneResult) {
						System.out.println("상품정보를 찾을 수 없습니다.");
					}
				
			}

			else if (sel == 4) {
				System.out.println("===상품 재고현황 조회입니다.===");
				for (int i = 0; i < product.size(); i++) {
					Product n = product.get(i);
					if (product.size() != 0) {
						System.out.println("=========================================");
						System.out.printf(" %s\t%s\t\t수량 : %d\n", n.getNumber(), n.getTitle(), n.getAmount());
					}

					if (product.size() == 0) {
						System.out.println("등록된 상품이 존재하지 않습니다.");
					}
				}
			}

			else if (sel == 5) {
				System.out.println("===프로그램 종료===");
				System.exit(0);
			}

		} while (sel != 5);
	}
}
