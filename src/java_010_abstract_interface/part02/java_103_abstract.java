package java_010_abstract_interface.part02;

public class java_103_abstract {

	public static void main(String[] args) {
		
		Rect rect =new Rect(10, 20);
		System.out.println("사각형 넓이 : " + rect.getArea());
		
		Tri tr = new Tri(10,20);
		System.out.println("삼각형 넓이 : " + tr.getArea());
		
	}

}
