package chapter_exer06_04;

// 생성자 오버로딩

public class Rectangle {
	int width;
	int height;
	String color;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 메서드 오버로딩
	public int recArea() {
		return width*height;
	}
	public int recArea(int width, int height) {
		return width*height;
	}
	public int recArea(int width) {
		return width * this.height;
	}
	public double recArea(double width) {
		return width * this.height;
	}
//	public int recArea(int w) {
//		return w * this.height;
//	} -> 위 33번줄 메소드와 동일한 메소드로 간주되어 에러 발생
	
	// 이름은 같지만 다양한 매개변수를 받아서 하나의 이름으로 각기 다른 방법으로 처리
}
