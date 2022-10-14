package java_009_inheritance.part09;

public class java_100_inheritance {

	public static void main(String[] args) {
		
		HandPhone[] hp = new HandPhone[6];
		hp[0] = new HandPhone("삼성", "SHV-E2505", 200000);
		hp[1] = new HandPhone("삼성", "SHV-E1605", 180000);
		hp[2] = new HandPhone("아이폰", "A1586", 250000);
		hp[3] = new HandPhone("아이폰", "A1524", 220000);
		hp[4] = new HandPhone("LG", "LG-F700L", 190000);
		hp[5] = new HandPhone("LG", "LG-F650L", 180000);
		
		for(HandPhone hPhone : hp)
			System.out.println(hPhone.toString());
		
		
		System.out.println("====================================");
		
		SmartPhone[] sp = new SmartPhone[4];
		sp[0] = new SmartPhone("삼성", "SHV-E2505", 200000, "010-2534-2542", "SK");
		sp[1] = new SmartPhone("아이폰", "A1586", 250000, "010-2532-5902", "LG");
		sp[2] = new SmartPhone("LG", "LG-F650L", 180000, "010-7280-5283", "KT");
		sp[3] = new SmartPhone("아이폰", "A1524", 220000, "010-2259-3052", "LG");
		
		
		for(SmartPhone sPhone : sp)
			System.out.println(sPhone.toString());
		
	}

}
