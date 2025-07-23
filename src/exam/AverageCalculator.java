package exam;


public class AverageCalculator {

	int[] num = {10,20,30,40,50};

	public AverageCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AverageCalculator(int[] num) {
		super();
		this.num = num;
	}
		int sum = 0;
		int avg = 0;
	public int getAverage() {
		for(int i = 0; i < num.length ;i++) {
			sum = sum + num[i];	
		}
		avg = sum / num.length;
		System.out.println(avg);
		
		return avg;
	}
	
	// main 작성완료
	
}
