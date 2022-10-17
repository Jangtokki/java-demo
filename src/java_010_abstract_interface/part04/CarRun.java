package java_010_abstract_interface.part04;

public interface CarRun {
	
	int carCount = 5;  //public static final carCount = 5;
	//public CarRun() {}
	
	void prn(); // abstract public
	//void display() {};
	class Sun{ //public static
		public Sun() {
			System.out.println("Sun Constructor");
		}
	}
	
	
}
