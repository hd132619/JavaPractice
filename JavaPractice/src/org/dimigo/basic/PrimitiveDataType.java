package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean gender = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char blood = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		if(gender)
			System.out.println("성별 : 여자");
		else System.out.println("성별 : 남자");
		
		System.out.printf("나이 : %d 세\n", age);
		System.out.printf("키 : %.1f cm\n", height);
		System.out.printf("몸무게 : %.1f kg\n", weight);
		System.out.println("혈액형 : " + blood + "형");

	}
	
}