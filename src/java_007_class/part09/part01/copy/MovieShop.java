package java_007_class.part09.part01.copy;

public class MovieShop {
	String name;
	int price;
	int person;

	public MovieShop() {

	}

	public MovieShop(String name, int price, int person) {
		this.name = name;
		this.price = price;
		this.person = person;
	}

	public int countMoney() {
		return price * person;
	}

	public void display() {
		System.out.printf("%s %d\n", name, countMoney());
	}
}//end class
