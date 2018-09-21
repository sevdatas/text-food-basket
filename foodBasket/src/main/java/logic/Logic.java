package logic;

import java.util.Scanner;

import entities.Basket;
import entities.Food;
import entities.Payment;
import environment.Environment;

public class Logic {
	Environment elist = new Environment();
	public Basket basketlist = new Basket();
	Scanner keyboard = new Scanner(System.in);
	
	public void listAllmeals() {

		for (int i = 0; i < elist.meal.size(); ++i) {
			System.out.println((i+1) + ":"+ elist.meal.get(i).kind +"-->"+ Integer.toString(elist.meal.get(i).price));

		}

		System.out.println("Sepete atmak istediðiniz yemeðin numarasýný giriniz:");
	}

	public void listAllpaymentoptions() {
		for (Payment po : elist.paymentopt) {
			System.out.println(Integer.toString(po.index) + po.paymentname + Integer.toString(po.installmentnum));
		}
	}

	public void listBasket() {
		for (Food food : basketlist.meal) { // basketlist.get(ind);
			System.out.println(food.kind + Integer.toString(food.price));
		}
	}
    
	
	public void Logic() {	
		
		listAllmeals();
		
		int choosemealint = keyboard.nextInt();
		
        Food chosenFood = elist.meal.get(choosemealint - 1);
		
		basketlist.meal.add(chosenFood);	
		
        System.out.println("Yemek Listesini görmek için 1, sepeti görmek için 2:");
	}
	public void run() {
		//Scanner keyboard = new Scanner(System.in);

		//listAllmeals();

		//int choosemealint = keyboard.nextInt();

		//Food chosenFood = elist.meal.get(choosemealint - 1);
		
		//basketlist.meal.add(chosenFood);
		
		if (basketlist.meal.size()==0)
		{
			Logic();
			
            //System.out.println("Yemek Listesini görmek için 1, sepeti görmek için 2:");
		    
			int myint = keyboard.nextInt();
			
			if (2 == myint)
			{
			  listBasket();
			} 
			else 
			{
			  Logic();
			}
		}
		else
		{
			System.out.println("Yemek Listesini görmek için 1, sepeti görmek için 2:");
		    
			int myint = keyboard.nextInt();
			
			if (2 == myint)
			{
			  listBasket();
			} 
			else 
			{
			  Logic();
			}
		}
		
	}

}
