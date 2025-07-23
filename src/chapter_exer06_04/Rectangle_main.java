package chapter_exer06_04;

public class Rectangle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성자 오버로딩
		Rectangle rec1 = new Rectangle(20, 10, "blue");
		Rectangle rec2 = new Rectangle(100, 200);
		Rectangle rec3 = new Rectangle();
	
		
		int area1 = rec1.recArea();
		int area2 = rec1.recArea(200);
		int area3 = rec1.recArea(30, 40);

		// 메서드 오버로딩
		System.out.println(area1);
		// 200
		System.out.println(area2);
		// 2000
		System.out.println(area3);
		// 1200
		// 통일성 있게 같은 메서드 사용해서 값을 다 다르게 출력할 수 있음(오버로딩 하는 이유)
	}

}
