package edu.kh.method.model.vo;

public class Member { // 회원 클래스
	// 속성 + 기능 필요!
	
	// 필드 (== 속성)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	
	
	
	// 생성자 (== 기능)
	// 생성자 규칙 : 반환형이 없고, 클래스 명과 이름이 같아야 한다.
	// ctrl + space + enter
	
	public Member() {}
	// 기본생성자 없으면 컴파일러가 자동으로 생성해주지만
	// 매개변수 생성자가 하나라도 있다면 자동생성 안해줌
	
		public String getMemberId() {
		return memberId;
	}	
		// 매개변수 생성자(모든 필드 초기화용)

	public Member(String memberId, String memberPw, String memberName, int memberAge) {
	// 오버로딩 적용중 (1. 이름이 같아야 한다)
		// 2. 매개변수의 개수, 타입, 순서중 하나하도 달라야 한다)
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	
	// 메서드 (== 기능)
	// getter / setter 

	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

}
