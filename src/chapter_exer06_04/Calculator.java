package chapter_exer06_04;

public class Calculator {
	
	public int add(int num1 ,int num2) {
		return num1 + num2;
	// 메소드에도 인수 또는 매개변수 부여 가능
	}
	public int minus(int num1 ,int num2) {
		return num1 - num2;
	}
	public int mul (int num1, int num2) {
		return num1 * num2;
	}
	public double divid(int num1 ,int num2) {
		return num1 / num2;
	}
	public int total(int[] numbers) {
			int total = 0;
			for(int num : numbers) {
				total = total +num;
			}
		return total;
	}
		public int total2(int...numbers) {
			int total2 = 0;
			for(int num : numbers) {
				total2 = total2 +num;
			}
			return total2;
//			System.out.println("안녕"); -> return 다음 나오는 코드는 실행 할 수 없음 error (퇴근)
	
		
	}
}