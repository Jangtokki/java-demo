package java_020_thread.part01;

public class User extends Thread{
	
	public User() {
		
	}
	
	@Override
	public void run() {
		//Thread로 실행해야 할 문장을 이곳에서 구현
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i=%d\n", getName(), i);
		}
	}

}
