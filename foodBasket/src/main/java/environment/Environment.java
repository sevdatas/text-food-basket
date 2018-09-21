package environment;

import java.util.ArrayList;
import java.util.List;

import entities.Food;
import entities.MeatMeal;
import entities.Pasteries;
import entities.Payment;
import entities.Vegimeal;
import entities.paymentopt;

public class Environment {
	public List<Food> meal = new ArrayList<Food>();	
	public List<Payment> paymentopt = new ArrayList<Payment>(3);	

	public Environment() {
		this.generateEntities();
		
	}

	private void generateEntities() {
		MeatMeal mm1 = new MeatMeal(45, "beyti");
		MeatMeal mm2 = new MeatMeal(40, "urfa");
		MeatMeal mm3 = new MeatMeal(30, "adana");
		MeatMeal mm4 = new MeatMeal(20, "ciðer");
		
		Vegimeal vm1 = new Vegimeal(12,"ýspanak");
		Vegimeal vm2 = new Vegimeal(13,"kereviz");
		Vegimeal vm3 = new Vegimeal(15,"enginar");
		
		Pasteries p1 = new Pasteries(10, "çið börek");
		Pasteries p2 = new Pasteries(20, "mantý");

		
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