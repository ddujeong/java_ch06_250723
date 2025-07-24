package chapter06_06;

 class Tire {
	// 필드에 붙는건 프라이빗 or 생략
	private String tireName;
	int tirePrice;
	
	protected void tirePrint() {
		System.out.println("타이어");
	}
}
// protected 접근자 = 동일 패키지 내에서만 사용가능
// public 접근자 = 모든 패키지 클래서 내에서 사용가능
// private 접근자 = 동일 클래스 내에서만 사용가능