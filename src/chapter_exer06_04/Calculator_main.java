package chapter_exer06_04;

public class Calculator_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator();
		int result = cal1.add(10, 20);
		System.out.println(result);
	
		System.out.println(cal1.total (new int[]{10, 20, 30}));
		
		int[] arr1 = {10,20,30};
		System.out.println(cal1.total(arr1));
		System.out.println(cal1.total2(10,20,30));
	}

}
