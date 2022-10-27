package Project;

public class Product {
	
	String number;
	String title;
	int price;
	int amount;
	
	public Product() {
		
	}

	public Product(String number, String title, int price, int amount) {
		
		this.number = number;
		this.title = title;
		this.price = price;
		this.amount = amount;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
