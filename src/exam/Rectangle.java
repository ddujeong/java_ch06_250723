package exam;

public class Rectangle {
	double width;
	double height;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
//	double circle = (width*2) + (height*2);
	public void cir() {
		double circle = (width*2) + (height*2);
		System.out.println(circle);
	} 
	
}
// main 완성