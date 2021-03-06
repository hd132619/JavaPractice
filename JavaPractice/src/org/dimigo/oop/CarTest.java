/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 car = new Car2();
		
		System.out.println("<< 제조사 목록 >>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getcolor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println("");
		
		car = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getcolor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println("");
		
		car = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getcolor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println("");
		/*
		 car.setCompany("기아자동차"); 
		System.out.println("제조사명 : " + car.getCompany());
		car.setModel("K7");
		System.out.println("모델명 : " + car.getModel());
		car.setColor("흰색");
		System.out.println("색상 : " + car.getcolor());
		car.setMaxSpeed(246);
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		car.setPrice(40000000);
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println("");
		
		car.setCompany("삼성자동차");
		System.out.println("제조사명 : " + car.getCompany());
		car.setModel("SM7");
		System.out.println("모델명 : " + car.getModel());
		car.setColor("회색");
		System.out.println("색상 : " + car.getcolor());
		car.setMaxSpeed(200);
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		car.setPrice(38000000);
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		*/
	}

}
