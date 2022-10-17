package java_010_abstract_interface.prob.part02;

public class MotorBicycle implements IBicycle, IMotor {
    // 멤버변수 추가
    int id;
    String brand;
    
    public MotorBicycle() {
		// TODO Auto-generated constructor stub
	}
    
    public MotorBicycle(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	// IBicycle에 있는 추상 메소드를 구현하세요
    public void prtInfo() {
        //여기
    	System.out.printf("ID: %d\nBrand: %s\n", id, brand);
    	System.out.printf("Fram Size: %d\n", FrameSize_M);
    	System.out.printf("Motor Size: %d\n", Motor_Size_Large);
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void start() {
       System.out.println("## 모터 start!!");
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void stop() {
        //여기
    	System.out.println("## 모터 stop!!");
    }

}
