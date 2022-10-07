package basic;

public class Java_010_operator {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = ++i;
		System.out.printf("i=%d, j=%d\n", i , j);
		
		i = 5;
		j= 0;
		
		//후위형
		j = i++;
		System.out.printf("i=%d, j=%d\n", i , j);
		
		
		
	}

}
