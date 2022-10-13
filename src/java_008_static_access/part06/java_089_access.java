package java_008_static_access.part06;

import java_008_static_access.part05.java_087_access;

/*
 * 클래스 관계
 * 1 has a : 포함관계
 * 2 is a : 상속관계
 * 
 */

public class java_089_access extends java_087_access{

	public static void main(String[] args) {
		//java_087_access p = new java_087_access();
		java_089_access p = new java_089_access();
		//System.out.printf("var_private:%d\n", p.var_private);
		//System.out.printf("var_default:%d\n", p.var_default);
		System.out.printf("var_protected:%d\n", p.var_protected);
		System.out.printf("var_public:%d\n", p.var_public);
	}

}
