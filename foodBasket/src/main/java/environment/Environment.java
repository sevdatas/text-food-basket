package environment;

import java.util.ArrayList;
import java.util.List;

import entities.foods;
import entities.meatmeals;
import entities.pasteries;
import entities.payment;
import entities.vegimeals;
import entities.paymentopt;

public class Environment {
	public List<foods> meal = new ArrayList<foods>();
	public List<payment> paymentopt = new ArrayList<payment>(3);	
	
	public Environment() {
		this.generateEntities();
		
	}

	private void generateEntities() {
		meatmeals mm1 = new meatmeals(1,45, "beyti");
		meatmeals mm2 = new meatmeals(2,40, "urfa");
		meatmeals mm3 = new meatmeals(3,30, "adana");
		meatmeals mm4 = new meatmeals(4,20, "ciðer");
		
		vegimeals vm1 = new vegimeals(5,12,"ýspanak");
		vegimeals vm2 = new vegimeals(6,13,"kereviz");
		vegimeals vm3 = new vegimeals(7,15,"enginar");
		
		pasteries p1 = new pasteries(8,10, "çið börek");
		pasteries p2 = new pasteries(9,20, "mantý");

		
		paymentopt po1 = new paymentopt(1,1, "havale");	
		paymentopt po2 = new paymentopt(2,9, "kredi kartý");
		paymentopt po3 = new paymentopt(3,1, "kapýda ödeme");
		
		this.meal.add(mm1);
		this.meal.add(mm2);
		this.meal.add(mm3);
		this.meal.add(mm4);		
		this.meal.add(vm1);
		this.meal.add(vm2);
		this.meal.add(vm3);		
		this.meal.add(p1);
		this.meal.add(p2);
		
		this.paymentopt.add(po1);
		this.paymentopt.add(po2);
		this.paymentopt.add(po3);

	}

}