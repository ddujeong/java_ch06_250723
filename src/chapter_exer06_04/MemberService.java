package chapter_exer06_04;

public class MemberService {

		String id;
		String password;
		
		public MemberService() {
			super();
			// TODO Auto-generated constructor stub
		}
		public MemberService(String id, String password) {
			super();
			this.id = id;
			this.password = password;
		}
		public MemberService(String password) {
			super();
			this.password = password;
		}


		public boolean login() {
			if (id.equals("hong") && password.equals("12345")) {
				return true;
			} else {return false;
			}
			
		}
		public void logout() {
			System.out.println("로그아웃 되었습니다.");
		}
}
