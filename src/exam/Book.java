package exam;

public class Book {
	String name;
	int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("책 이름 : " + name + " \n책 가격 : " + price + "원");
	}
	
}
