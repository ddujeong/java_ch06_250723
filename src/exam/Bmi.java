package exam;

public class Bmi {
	double weight = 60.0;
	double height = 160.0;
	public Bmi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bmi(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	double bmi = weight/(height*height);
	public double bmiCalulator() {
		System.out.println(bmi);
		return bmi;
	}
	
	
}
// main 작성완료