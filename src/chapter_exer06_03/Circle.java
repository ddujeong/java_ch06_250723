package chapter_exer06_03;

public class Circle {

	
	int radius;// 반지름
	double PI = 3.14; // 파이값 바꾸면 안되는 값(상수)
	
	public Circle() { // 기본 생성자
	}

	public Circle(int radius) { // 매개변수 생성자
		this.radius = radius;
	}

	// 입력된 반지름을 가진 원의 면적을 반환하는 메서드
	
	public double circleArea() {
		return PI*(radius*radius);
	}

}
