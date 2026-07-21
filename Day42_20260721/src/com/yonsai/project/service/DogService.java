package com.yonsai.project.service;

import java.util.HashMap;

class Dog {
	String dogId;
	String name;
	String breed;
	
	// 클래스 멤버 변수를 한꺼번 자동으로 출력해주는 특별한
	// 함수가 있다!
	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", name=" + name + ", breed=" + breed + "]";
	}
}

public class DogService {

	public void 강아지입양테스트() {
		
		HashMap<String, Dog> 강아지들 = new HashMap<>();

		// 2. Dog 객체 1(d001, 초코, 말티즈, false) 생성 후 필드 값 대입
		Dog 강아지1 = new Dog();
		강아지1.dogId = "d001";
		강아지1.name = "초코";
		강아지1.breed = "말티즈";
		강아지들.put("d001", 강아지1);

		// 3. Dog 객체 2(d002, 몽이, 푸들, false) 생성 후 필드 값 대입
		Dog 강아지2 = new Dog();
		강아지2.dogId = "d002";
		강아지2.name = "몽이";
		강아지2.breed = "푸들";
		강아지들.put("d002", 강아지2);

		// 4. Dog 객체 3(d003, 보리, 진돗개, false) 생성 후 필드 값 대입
		Dog 강아지3 = new Dog();
		강아지3.dogId = "d003";
		강아지3.name = "보리";
		강아지3.breed = "진돗개";
		강아지들.put("d003", 강아지3);
		
		System.out.println(강아지들);
		
	}
}
