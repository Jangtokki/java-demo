package java_020_thread.part01;

public class java_212_thread {

	public static void main(String[] args) {
		
		User us =new User();
		us.start();
		
		for(int j=0; j<=5; j++) {
			System.out.printf("%s j=%d\n", Thread.currentThread().getName(),j);
		}
	}

}
