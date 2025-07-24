package chapter06_06;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		
		// member.name = "홍길동";
		member.setName("홍길동");
		// member.id = "tiger";  -> 필드의 id가 private -> 값을 넣을 수 없음
		member.setId("tiger");
		//member.pw = "12345";
		member.setPw("12345");
		// member.age = 21;
		member.setAge(21);
		
		System.out.println(member.getName());

			
		// Member member2 = new Member("이슨신", "lion", "12345", 27);
		
	
		// 무결성 
	
	}
	}
