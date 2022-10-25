package java_017_collection.prob;

import java.util.ArrayList;


public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		int sum = 0;
		for(BookDTO dto : bookList)
		{
			
			if(dto.getKind()==kind) {
				
				
				sum += dto.getRentalPrice();
			}
		}
			
		return sum;
	}//end getRentalPrice()
}//end class








