package java_020_thread.part02;

public class java_213_thread {

	public static void main(String[] args) {
		UserImp ui = new UserImp();
		Thread th = new Thread(ui);
		
		th.start();
		
		for(int j=0; j<=5; j++) {
			System.out.printf("%s j=%d\n", Thread.currentThread().getName(),j);
		}

	}

}
