package exam;
	public class Triangle {
//		double a ;
//		double b ;
//		double c ;
//		public Triangle() {
//			super();
//			// TODO Auto-generated constructor stub
//		}
//		public  Triangle(int a, int b, int c) {
//			super();
//			this.a = a;
//			this.b = b;
//			this.c = c;
//		}
//		public  Triangle(double a, double b, double c) {
//			super();
//			this.a = a;
//			this.b = b;
//			this.c = c;
//		}
//		boolean result = true;
//		public boolean isValid() {
//			if (a + b > c && a + c > b && b + c > a) {
//				return true;
//			} else {
//			} return false;
//		}
//		
		public boolean isValid(int a, int b, int c) {
			boolean flag = a + b > c && a + c > b && b + c > a;
			return flag;
		}
	}
	// main 완료


