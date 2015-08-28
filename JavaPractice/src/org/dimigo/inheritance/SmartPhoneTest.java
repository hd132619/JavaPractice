/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] phones = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone phone : phones){
			System.out.println(phone);
			phone.turnon();
			phone.pay();
			
			phone.useSpecialFunction();
			
			phone.turnoff();
			System.out.println();
		}
		
	}

}
