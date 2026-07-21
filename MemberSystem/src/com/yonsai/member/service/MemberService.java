package com.yonsai.member.service;

import java.util.HashMap;

class Member {
	String id;
	String password;
	String name;
}

public class MemberService {
	
	public void 회원가입() {
		
		HashMap<String, Member> 회원목록 = new HashMap<>();
		
		// 1. 아이디랑 비밀번호 이름 3개만 키보드로 입력 받는다.

		// 2. Member클래스에 저장하기 

		// 3. HashMap을 이용해서 저장하기 
		//    key 값은 아이디로 저장!
		//    단! 조건 입력한 아이디가 회원목록변수 안에 key가 있다면
		//    "다시 입력하세요 입력을 다시받아야된다." 다시 중복확인
		//    중복이 안되면 "성공적으로 회원가입을 완료했습니다."
		
	}

}
