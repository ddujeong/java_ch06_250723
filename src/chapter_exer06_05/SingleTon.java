package chapter_exer06_05;

public class SingleTon { 
	// 메모리에 반드시 하나만 존재하여야 하는 인스턴스를 만들어주는 클래스
	private static SingleTon singleTon = new SingleTon();
	// 정적 멤버(필드)	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
	
		return singleTon;
	}
	
		
}
// 싱글톤 클래스로 구현하면 프로그램에서 반드시 1개만 존재함