package exam;

public class Bmi {
//	double weight ;
//	double height ;
//	public Bmi() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Bmi(double weight, double height) {
//		super();
//		this.weight = weight;
//		this.height = height;
//	}
//	double bmi;
//	public double bmiCalulator() {
//		 bmi = weight/(height*height);
//		return bmi;
//	}
//	
	public void bmicalculator(int weight, int height) {
		double bmi = (double)weight / (height * height);
		System.out.println("bmi: " + bmi);
	}
	public void bmicalculator(double weight, double height) {
			double bmi = weight / (height * height);
			System.out.println("bmi: " + bmi);
	// 매서드 오버로딩
	
	}
}
