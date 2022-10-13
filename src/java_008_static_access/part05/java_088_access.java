package java_008_static_access.part05;

public class java_088_access {

	public static void main(String[] args) {
		
		java_087_access p = new java_087_access();
		//System.out.printf("var_private:%d\n", p.var_private);
		System.out.printf("var_default:%d\n", p.var_default);
		System.out.printf("var_protected:%d\n", p.var_protected);
		System.out.printf("var_public:%d\n", p.var_public);
		
	}

}
