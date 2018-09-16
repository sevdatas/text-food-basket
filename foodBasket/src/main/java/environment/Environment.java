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
	public List<foods> meatmeal = new ArrayList<foods>(4);
	public List<foods> vegimeal = new ArrayList<foods>(3);
	public List<foods> pastry = new ArrayList<foods>(3);
	public List<payment> paymentopt = new ArrayList<payment>(3);
	
//	ArrayList<BankAccount> arl = new ArrayList<BankAccount>(5);

	meatmeals mm = new meatmeals(0, null);
	vegimeals vm = new vegimeals(0,null);
	pasteries p = new pasteries(0, null);
	paymentopt po = new paymentopt(0, null);	
	
	
	public Environment() {
		this.generateEntities();
		
	}

	private void generateEntities() {
   	    meatmeals.this.kind="beyti";
   	    
		this.mm.add(meatmeals);
	    this.meatmeal.add(35,"urfa" );
		this.meatmeal.add(33,"adana" );
		this.meatmeal.add(40,"þiþ" );
				
		this.vegimeal.add(12,"ýspanak" );
		this.vegimeal.add(13,"kereviz" );
		this.vegimeal.add(16,"enginar" );
				
		this.pastry.add(10,"çið börek" );
		this.pastry.add(20,"mantý" );
				
		this.paymentopt.add(1,"Nakit" );
		this.paymentopt.add(9,"Kredi Kartý" );
		this.paymentopt.add(1,"Havale" );
	}

}