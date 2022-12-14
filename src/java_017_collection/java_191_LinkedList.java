package java_017_collection;

import java.util.LinkedList;

public class java_191_LinkedList {

	public static void main(String[] args) {


		/*
		 * Queue(큐)
		 * 1. FIFO(First in First out) : 제일 먼저 저장한요소를 제일먼저 가져옴
		 * 2. 최근사용문서, 인쇄작업대기목록, 버퍼
		 */
		
		LinkedList<String> nQueue = new LinkedList<String>();
		
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.pop());
	}

}
