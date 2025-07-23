package chapter_exer06_05;

public class Static_test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_test st1 = new Static_test(); // st1 인스턴스(객체) 생성
		st1.width = 10;
		st1.height = 20;
		st1.color = "red";
		Static_test st2 = new Static_test(); // st2 인스턴스(객체) 생성
		st2.width = 50;
		st2.height = 60;
		st2.color = "blue";
		// st2.PI = 3.141592; -> 상수로 값을 수정할 수 없음(읽기전용)!!
		
	}

}
