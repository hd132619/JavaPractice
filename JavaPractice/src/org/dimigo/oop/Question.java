/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String singer = "테일러 스위프트";
		String actor = "하정우";
		String model = "바바라 팔빈";
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		if(answer.equals(singer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		System.out.println("");
		
		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if(answer2.equals(actor)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		System.out.println("");
		
		System.out.println("가장 좋아하는 모델은?");
		String answer3 = scanner.nextLine();
		if(answer3.equals(model)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}

		scanner.close();
	}

}
