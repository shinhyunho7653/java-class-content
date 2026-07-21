package com.yonsai.project.service;

import java.util.HashMap;

class Student {
	String studentId;
	String name;
	int score;
}

public class Test {
	
	public void 실습1() {
		
		HashMap<String, Student> 학생들 = new HashMap<>();
		
		Student 학생1 = new Student();
		
		학생1.studentId = "s001";
		학생1.name = "김민지";
		학생1.score = 95;
		
		학생들.put(학생1.studentId, 학생1);
		
		Student 학생2 = new Student();
		
		학생2.studentId = "s002";
		학생2.name = "이도현";
		학생2.score = 88;
		
		학생들.put(학생2.studentId, 학생2);
		
		System.out.println(학생들.get("s001").name);
		System.out.println(학생들.get("s001").score);
		
	}

}
