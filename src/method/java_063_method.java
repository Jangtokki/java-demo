package method;

public class java_063_method {

	public static void main(String[] args) {
		int[] num = new int[] {5, 2, 8, 7, 4};
		System.out.printf("최대값:%d\n", max(num));
		System.out.printf("최소값:%d\n", min(num));
		System.out.printf("배열의크기:%d\n", size(num));
	}
	
	public static int max(int[] arr) {
		int result = arr[0];
		
	
		for(int i =1;i<arr.length; i++) {
			if(arr[i]-result>0) {
				result = arr[i];
				
			}
		}
			
		return result;
		
		
	}
	
	public static int min(int[] arr) {
		int result = arr[0];
		
		
		for(int i =1;i<arr.length; i++) {
			if(result-arr[i]>0) {
				result = arr[i];
				
			}
		}
			
		return result;
	}
	
	public static int size(int[] arr) {
		
		return arr.length;
	}

}
