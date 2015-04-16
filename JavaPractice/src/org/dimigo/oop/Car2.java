/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class Car2 {
	
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;

	public Car2() {
		
	}
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice){
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getcolor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public int getPrice(){
		return price;
	}
	
	/*public void setCompany(String newcompany){
		company = newcompany;
	}
	
	public void setModel(String newmodel){
		model = newmodel;
	}
	
	public void setColor(String newcolor){
		color = newcolor;
	}
	
	public void setMaxSpeed(int newmaxSpeed){
		maxSpeed = newmaxSpeed;
	}
	
	public void setPrice(int newprice){
		price = newprice;
	}*/
}
