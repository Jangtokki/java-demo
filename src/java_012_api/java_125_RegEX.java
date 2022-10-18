package java_012_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java_125_RegEX {

	public static void main(String[] args) {
		
		String sn = "12345";
		String sb = "2bsba5";
		String st = "aetwef";
		
		//a-z A-Z가 포함되어있으면 true 아니면 false
		System.out.println(sn.matches(".*[a-zA-z_*$].*"));
		
		//0-9가 포함되어있으면 true 아니면 false를 리턴한다
		System.out.println(sb.matches(".*[0-9].*")); //같음
		System.out.println(sb.matches(".*[\\d].*")); //같음
		System.out.println(sb.matches(".*\\d.*"));	//같음
		
		//0-9가 포함되어있지않으면 true 포함되어있으면 false를 리턴한다
		System.out.println(sb.matches(".*[^0-9].*"));
		System.out.println(sb.matches(".*[\\D].*"));
		System.out.println(sb.matches(".*\\D.*"));
		
		//2로 시작하면 true 아니면 false로 리턴
		System.out.println(sb.matches("2.*"));
		
		//2로 시작하고 5로 끝나면 true 아니면 false
		System.out.println(sb.matches("2.*5"));
		
		System.out.println("======================================");
		
		//저장된 값이 a이거나 b로 시작하고 그 뒤에 임의 문자가 5개이면 true 아니면 false
		System.out.println(st.matches("[ab].{5}"));
		
		//값이 a이나 b로 시작하고 임의문자가 1~5개이며 cc로 끝나면 true 아니면 false
		st = "aetwefcc";
		System.out.println(st.matches("[ab].{1,5}cc"));
		
		/*
		 * Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에
		 *          있는지를 확인한다.
		 * Pattern.comile(): 여러개의 텍스트를 재사용 가능한 Pattern 
		 *          인스턴스로 컴파일 한다.
		 * find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
		 * find(int start) : start 위치 부터 find 
		 * start() : 매칭되는 패턴의 시작 인덱스 반환 
		 * start(int group) : group이 매칭되는 시작 인덱스 반환
		 * end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
		 * end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
		 * group() : 최초로 그룹 매칭된 패턴을 반환 group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
		 * groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
		 * matches() : 패턴이 전체 문자열과 일치하면 True
		 */
		String input1 = "3absfa";
		//input1 = "12345";
		System.out.println(input1.matches("\\d"));
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input1);
		System.out.println(mc);
		System.out.println(mc.find());
		System.out.println(mc.find(1));
		
		System.out.println(Pattern.compile("\\d").matcher(input1).find());
		System.out.println(Pattern.compile("\\d").matcher(input1).find(0));
		
		//조건 : 데이터길이 5~10, 숫자와 영문 포함
		input1 = "wwfwfg3";
		
		// w - 영문 숫자 모두포함
		// d - 숫자 / s - 문자
		System.out.println(input1.matches("[\\w]{5,10}")
				&& Pattern.compile("[0-9]").matcher(input1).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input1).find()
				);
		
		/*
		Parttern 플래그 값 사용(상수)
		Pattern.CANON_EQ : None표준화된 매칭 모드를 활성화합니다.
		Pattern.CASE_INSENSITIVE : 대소문자를 구분하지 않습니다. 
		Pattern.COMMENTS : 공백과 #으로 시작하는 주석이 무시됩니다. (라인의 끝까지).
		Pattern.MULTILINE : 수식 '^' 는 라인의 시작과, '$' 는 라인의 끝과 match 됩니다.
		Pattern.DOTALL : 수식 '.'과 모든 문자와 match 되고 '\n' 도 match 에 포함됩니다.
		Pattern.UNICODE_CASE : 유니코드를 기준으로 대소문자 구분 없이 match 시킵니다.
		Pattert.UNIX_LINES : 수식 '.' 과 '^' 및 '$'의 match시에 한 라인의 끝을 의미하는 '\n'만 인식됩니다.
        */
		
		System.out.println("===============================================");
		
		String str = "the BEst  things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);
		
		Pattern pt = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mh = pt.matcher(str);
		int i = 1;
		while(mh.find())
			System.out.printf("%d번째 %d~%d %s\n", i++, mh.start(),mh.end(),mh.group());
		
		
		System.out.println("===============================================");
		/////////////////////////////////////////////////
		
		str = "The BEst10 things in best20 life are best30 free";
		pt = Pattern.compile("(best)(10|20|30)", Pattern.CASE_INSENSITIVE);
		mh = pt.matcher(str);
		i = 1;
		while(mh.find())
			System.out.printf("%d번째 %d~%d %s\n", i++, mh.start(),mh.end(),mh.group());
	}
	
	

}
