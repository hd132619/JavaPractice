package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a1 = 9, a2 = 10;
		double ah = 5.8;
		int b1 = 9;
		double bh = 5.4;
		
		double r1 = (a1 + a2) * ah / 2;
		double r2 = b1 * bh;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + r1);
		System.out.println("평행사변형 넓이 : " + r2);
		System.out.println("\n");
		
		if(r1 > r2)
			System.out.println("사다리꼴이 평행사변형보다 " + (r1 - r2) + " 더 큽니다.");
		else if(r2>r1)
			System.out.println("평행사변형이 사다리꼴보다 " + (r2 - r1) + " 더 큽니다.");
		else System.out.println("두 도형의 넓이가 같습니다.");

	}

}
