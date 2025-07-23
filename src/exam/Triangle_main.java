package exam;

public class Triangle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle rec1 = new Triangle(10, 10, 10);
		Triangle rec2 = new Triangle(10.0, 10.0, 30.0);
		
		System.out.println(rec1.isValid());
		System.out.println(rec2.isValid());
	}

}
