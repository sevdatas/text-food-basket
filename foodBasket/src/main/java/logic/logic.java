package logic;

import entities.foods;
import entities.payment;
import environment.Environment;

public class logic {
	public void listAllmeals() {
			
		for (foods meals : environment.meal ) {
			System.out.println(toString(meals.index) + meals.kind + toString(meals.price));
			
		}
	}

	public void listAllpaymentoptions()
	{
		for (payment po:environment.paymentopt)
		{System.out.println(toString(po.index) + po.paymentname + toString(po.installmentnum));}
	}
}
