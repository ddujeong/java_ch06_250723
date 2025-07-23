package chapter_exer06_03;

public class Car {
	String name;
	int maxSpeed;
	Engine engine;
	// 다른 클래스를 불러옴
	// Engine 클래스로 만든 객체를 필드(멤버 변수)로 선언
	// (String type, int displacment)
	
	public Car() {
	
	}
	
	public Car(String name, int maxSpeed, Engine engine) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.engine = engine;
		// engine 클래스에서 만든 객체를 대입해야함
	}

	public void carEngineType() {
		System.out.println("엔진 타입: " + engine.type);
		engine.printEngine();
	}
	
	public Engine outputEngine() {
		engine.type = "디젤";
		engine.displacment = 2;
		// 클래스 간에 다른 클래스에 있는 메소드를 호출 할 수 있음
		return engine;
	}
	
	public String[] outputcars() {
		String[] cars = {"소나타","아반떼", "K5"};
		carEngineType();
		// 클래스 내에서는 서로 다른 메서드를 호출할 수 있음
		// 클래스 내, 외부에서 매서드를 모두 불러올 수 있음
		return cars; // 배열
	}
	

}
