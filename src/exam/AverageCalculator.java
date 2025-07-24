package exam;


public class AverageCalculator {
//
//	int[] num;
//
//	public AverageCalculator() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public AverageCalculator(int[] num) {
//		super();
//		this.num = num;
//	}
//		int sum = 0;
//		int avg = 0;
//	public int getAverage() {
//		for(int i = 0; i < num.length ;i++) {
//			sum = sum + num[i];	
//		}
//		avg = sum / num.length;
//		System.out.println(avg);
//		
//		return avg;
//	}
//	
//	
	
	public void getAverage(int[] intArr) {
		
		int sum = 0;
		
		for(int num : intArr) {
			sum = sum + num;
		}
		 double avgArr = (double) sum / intArr.length;
		 
		 System.out.println(avgArr);
	}
}
