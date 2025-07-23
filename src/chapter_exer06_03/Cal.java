package chapter_exer06_03;


public class Cal {
//	Scanner num1 = new Scanner(System.in);
//	Scanner num2 = new Scanner(System.in);
	int num1;
	int num2;
	
	public Cal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cal(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void result() {
		int add= num1 + num2;
		int minus = num1 - num2;
		int mul = num1 * num2; 
		double divid = num1 / num2; 
		int square = num1*num1;
		
		System.out.println("덧셈 결과: " + add);
		System.out.println("뺄셈 결과: " + minus);
		System.out.println("곱셈 결과: " + mul);
		System.out.println("나눗셈 결과: " + divid);
		System.out.println("나눗셈 결과: " + square);
	}
}
