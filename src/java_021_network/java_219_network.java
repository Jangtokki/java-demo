package java_021_network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class java_219_network {

	public static void main(String[] args) {


		/*
		 * 네트워크 : 두대 이상의 컴퓨터를 케이블로 연결하여 구성하는 기능
		 * 클라이언트/서버 : 컴푸터간의 관계를 역할로 구분하는 개념
		 * 서버 : 서비스를 제공하는 컴퓨터
		 * 클라이언트 : 서비스를 제공받는 컴퓨터
		 * 서비스 : 서버가 클라이언트로부터 요청받은 작업을 처리하여  그결과를 제공하는 개념
		 * 네트워크 관련 정보 : java.net.*
		 * InetAddress : ip주소를 다루기 위한 클래스
		 */
		
		try {
			InetAddress ip = InetAddress.getByName("daum.net");
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
