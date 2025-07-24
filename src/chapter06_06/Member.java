package chapter06_06;

// VO ->value object
// DTO -> data transfer object
public class Member {
	private String name; // 회원의 이름
	private String id; // 회원의 아이디 
	private String pw; // 회원의 비밀번호
	private int age; // 회원의 나이
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String name, String id, String pw, int age) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	// setter -> private 값을 안전하게 가져와줌 
	public void setId(String id) { 
		// if (id.equals("tiger")) 
		// id 값이 "tiger" 인 경우에만 필드값에 넣음
		this.id = id; 

	}
	public void setAge(int age) {
		// if(age > 0) 
		// age 값이 0보다 클 경우에만 필드값에 넣음
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPw(String pw) {
		this.pw =pw;
	}
	
	// getter -> setter 값을 가져와줌 
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public String getPw() {
		return this.pw;
	}
	public int getAge() {
		return this.age;
	}
	
	// 메소드를 통해서만 값을 바꿀 수 있게 만들어 주는 것 - setter
	}

