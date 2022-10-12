package java_006_class.part02;

public class java_066_book {

	public static void main(String[] args) {
		book bk = new book();
		bk.title = "칼의 노래";
		bk.state = false;
		
		book bs = new book();
		bs.title = "어두운 상점의 거리";
		bs.state = true;
		
		bk.display();
		bs.display();
		
		bs.borrow();
		bs.display();
				
		
	
	}

}
