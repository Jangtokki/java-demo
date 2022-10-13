package java_008_static_access.part04;


//javac -d . java_086_args.java
//java java_086_static.part04.java_086_args hello

public class java_086_args {

	public static void main(String[] args) {
		
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
		for(String data : args) {
			System.out.println(data);
		}
	}

}
