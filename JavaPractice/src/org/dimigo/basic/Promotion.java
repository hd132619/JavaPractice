package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int month=1700000;
		int number=3;
		int shop=1500;
		long year;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", month) + "원");
		System.out.println("점포 내 직원 수 : " +  number +"명");
		System.out.println("점포 수 : " + String.format("%,d", shop) + "개");
		System.out.println("\n");
		year = (long)month * 12 * number * shop;
		System.out.println("연간 인건비 : " + String.format("%,d", year) + "원");
	}

}
