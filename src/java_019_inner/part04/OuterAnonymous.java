package java_019_inner.part04;

public class OuterAnonymous {

	private int x;
	
	IinnerAnonymous ta = new IinnerAnonymous() {
		
		@Override
		void prn() {
			System.out.println("prn");
		}
	};
	
	public void display() {
		ta.prn();
		
		new IinnerAnonymous() {
			@Override
			void prn() {
				System.out.println("prn2");
				
			}
		}.prn();
	}

}
