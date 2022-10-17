package java_011_casting.part01;

public class java_109_casting {

	public static void main(String[] args) {
		/*
		 * 객체형변환 - 참조데이터 타입
		 * 1. 상속관계일때 형변환이 가능하다.
		 * 2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
		 * 	- 업캐스팅 : 부모객체로 자식객체를 참조하도록 형변환하는 기술
		 * 	- 다운캐스팅 : 업캐스팅을 다시 원상복귀해주는 형변환기술
		 */
		
		Parent p = new Parent();
		Child c = new Child();
		
		//Parent p = new Child();
		p=c; //업캐스팅(up-casting)
		p.process();
		
		//다운캐스팅(down-casting)
		Child d = (Child) p;
		
		Parent pt = new Child();
		pt.process();
		
		Child cn = (Child)pt;
		cn.call();
		
	}

}
