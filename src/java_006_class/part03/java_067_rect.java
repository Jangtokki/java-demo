package java_006_class.part03;

public class java_067_rect {

	public static void main(String[] args) {
		
	Rect rt = new Rect();
	rt.width = 5;
	rt.height = 3;
	rt.color = "레드";
	
//	System.out.printf("%d %d\n", rt.width, rt.height);
	rt.display();
	
	Rect rc = new Rect();
	rc.width = 7;
	rc.height= 4;
	rc.color = "블루";
	
	rc.display();
	
	}

}
