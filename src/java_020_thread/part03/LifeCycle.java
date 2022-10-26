package java_020_thread.part03;

public class LifeCycle extends Thread{

	
	/*
	 * 스레드 생명주기(Thread Life Cycle)
	 * start() - 실행준비상태(RUNNABLE) - run() - TEMINATED
	 * 									sleep(1000), wait()-대기상태(WAITING)
	 */
	
	public LifeCycle() {
		
	}
	
	@Override
	public void run() {
		System.out.println(getState());
	}
	
}
