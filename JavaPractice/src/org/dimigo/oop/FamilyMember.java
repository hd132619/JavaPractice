/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_FamilyMember
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class FamilyMember {

		private static int memberCnt;
		private String memberName;
		
		public FamilyMember(String memberName){
			this.memberName = memberName;
			memberCnt++;
		}
		
		public String getMemberName() {
			return memberName;
		}
		
		public static void printMemberCnt(){
			System.out.println("총 가족 구성원  수 : " + memberCnt + "명");
		}

}
