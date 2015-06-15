/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_PiggyBankTest
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember mother = new FamilyMember("엄마");
		FamilyMember me = new FamilyMember("나");
		FamilyMember brother = new FamilyMember("동생");
		
		FamilyMember.printMemberCnt();
		System.out.println();
		
		PiggyBank.putMoney(father, 10000);
		PiggyBank.putMoney(mother, 5000);
		PiggyBank.putMoney(me, 2000);
		PiggyBank.putMoney(brother, 1000);
		
		PiggyBank.printBalance();
		System.out.println();
		PiggyBank.putMoney(me, 1000);
		PiggyBank.printBalance();
	}

}
