package java_006_class.part09;

public class java_073_this {

	public static void main(String[] args) {
		/*
		 * [실행결과]
		 * 노래제목 : Dansing Queen
		 * 가수 : ABBA
		 * 앨범 : Arrival
		 * 작곡가 : Benny Andersson, Bjorn Ulvaeus
		 * 년도 : 1997
		 * 트랙 : 2
		 */
		Song sg = new Song("Dansing Queen", "ABBA", "Arrival", new String[] {"Benny Andersson", "Bjorn Ulvaeus"}, 1977, 2);
		
		sg.show();
	}
	
	
	

}
