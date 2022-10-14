package java_009_inheritance.prob.part04;

public class HealthRate extends Health {

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);
	}

	private double standardHealth() {
		// 표준체중 로직구현을 구현하세요.
		/*사람의 신장(H)와 몸무게(W)를 입력받아 비만도(B)를 계산하는 프로그램작성
		 표준체중:SW=(H-100)*0.9
		 비만도: B(%)=(W-SW)/SW*100
		 만도가 10% 이내이면 정상, 10%이상 20%이면 과체중, 20% 이상은 비만
		 */
		
		return (height-100)*0.9;

		
	}

	private String rateCheck() {
		// 비만도를 로직구현을 구현하세요
		double hResult;
		hResult = (weight-standardHealth())/standardHealth()*100;
		
		String result;
		if(hResult<10) {
			result = "정상";
		}else if(hResult<=20 && hResult>10) {
			result = "과체중";
		}else if(hResult>20) {result = "비만";}
		else result = "비정상";
		
		return result;
	}

	// prn()메소드 오버라이딩
	@Override
	public void prn() {
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f  %s입니다.\n", name, height, weight, rateCheck());
	}

}// end HealthRate