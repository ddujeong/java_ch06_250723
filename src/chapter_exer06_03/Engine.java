package chapter_exer06_03;

public class Engine {
	
	String type;
	int displacment; // 배기량
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Engine(String type, int displacment) {
		super();
		this.type = type;
		this.displacment = displacment;
	}
	
	public void printEngine() {
		System.out.println("엔진 타입: " + type);
		// 프린트문은 return 값이 아님 오로지 출력만 함 -> void
		// return 값을 받으려면 클래스명 입력 후 return
		
	}
	
	
}
