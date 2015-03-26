package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String car = "고속버스";
		int killo = 10;
		int money = 0;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + killo + "km");
		System.out.println("차종 : " + car);
		
		if(car == "고속버스"){
			if(killo % 10 == 0)
				money = 850 + (killo/10-1)*300;
			else
				money = 850 + (int)(killo / 10) * 300;
		}
		else if(car == "경차"){
			if(killo % 10 == 0)
				money = 300 + (killo/10-1)*200;
			else
				money = 300 + (int)(killo / 10) * 200;
		}
		else {
			if(killo % 10 == 0)
				money = 200 + (killo/10-1)*200;
			else money = 200 + (int)(killo / 10) * 200;
		}
		
		System.out.println("통행료 : " + money + "원");
	}

}
