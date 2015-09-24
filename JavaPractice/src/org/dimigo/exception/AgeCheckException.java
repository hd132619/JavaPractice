/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_AgeCheckException
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
@SuppressWarnings("serial")
public class AgeCheckException extends Exception{
	public AgeCheckException(){
		
	}
	public AgeCheckException(Movie movie){
		System.out.println(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
	}
}
