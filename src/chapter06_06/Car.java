package chapter06_06;

import chapter06_06_01.AutoCar;
// public 과 import 문으로 다른 패키지 클래스 사용 가능

public class Car {
	public static void main() {
	AutoCar autoCar = new AutoCar(); // 다른 패키지 -> import 문 필수!
	Tire tire =new Tire(); // 같은 패키지 내에서는 import 과 public 이 필요 XX
	//tire.tireName = "금호";
	tire.tirePrice = 100000;
	tire.tirePrint();
	// 클래스 내에서만 사용 해야한다면 private 선언
	//-> 필드, 생성자, 매서드는 동일 클래스에서만 사용 가능 
}
}
