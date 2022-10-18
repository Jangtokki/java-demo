package java_012_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java_126_RegEX {

	public static void main(String[] args) {
		
		String Phone = "016-253-5343";
		System.out.println(Phone.matches("01(1|6|9)-([0-9]{3}|[0-9]{4})-[0-9]{4}"));
		System.out.println(Phone.matches("01(1|6|9)-([\\d]{3}|[\\d]{4})-[\\d]{4}"));
		
		Matcher mt = Pattern.compile("01(1|6|9)-([\\d]{3}|[\\d]{4})-[\\d]{4}").matcher(Phone);
		while(mt.find())
			System.out.printf("%s\n", mt.group());
	}

}
