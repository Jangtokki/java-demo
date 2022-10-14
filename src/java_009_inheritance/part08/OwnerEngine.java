package java_009_inheritance.part08;

public class OwnerEngine extends FireEngine{

	private int seat;
	
	public OwnerEngine() {
		this.seat = seat;
	}
	
	void information() {
		System.out.println(seat + "인승 차량입니다.");
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	@Override
	public String toString() {
				return String.format("차량의 색상:%s,  속도:%d\n", color, getSpeed());
	}
}
