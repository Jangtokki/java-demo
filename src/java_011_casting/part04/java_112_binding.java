package java_011_casting.part04;

public class java_112_binding {

	
	public static void process(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();
		
		if(tv instanceof SamsungTv) {
			SamsungTv stv = (SamsungTv)tv;
			stv.move();
			
		}else if(tv instanceof LgTv) {
			LgTv ltv = (LgTv) tv;
			ltv.call();
		}
	}
	
	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		process(lg);
		
		SamsungTv ss = new SamsungTv("SAMSUNG");
		process(ss);
		
		
	}

}
