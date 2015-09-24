/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_Movie
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	
	String getTitle(){
		return title;
	}
	int getLimitAge(){
		return limitAge;
	}
}
