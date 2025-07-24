package chapter_exer06_05;

public class SingleTonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon single1 = SingleTon.getInstance();//return singleTon 객체를 반환
		SingleTon single2 = SingleTon.getInstance();
		SingleTon single3 = SingleTon.getInstance();
		SingleTon single4 = SingleTon.getInstance();
		
		if (single1 == single2) {
			System.out.println("같은 객체를 참조하고 있습니다. ");
			
		}else {
			System.out.println("다른 객체를 참조하고 있습니다. ");
		}
		
	}

}
