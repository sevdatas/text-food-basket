package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Basket;
import entities.foods;
import entities.payment;
import environment.Environment;


public class logic {
	Environment elist = new Environment();	
	public List<foods> meal = new ArrayList<foods>();
	public List<Basket> basketlist = new ArrayList<Basket>();
	
	public void listAllmeals() {
			
		for (foods meals : elist.meal ) {
			System.out.println(Integer.toString(meals.index) + meals.kind + Integer.toString(meals.price));
			
		}
		
		System.out.println("Sepete atmak istediðiniz yemeðin numarasýný giriniz:");
	}

	public void listAllpaymentoptions()
	{
		for (payment po:elist.paymentopt)
		{
			System.out.println(Integer.toString(po.index)+ po.paymentname + Integer.toString(po.installmentnum));
		}
	}
	
	private void addBasket(int index, int price, String kind) {
		Basket basket = new Basket(index,price,kind);
		this.basketlist.add(basket);
	}

	public void listBasket()
	{
		for (Basket basket:basketlist)
		{
			System.out.println(basket.kind + Integer.toString(basket.price));
		}
	}
	
	public void run() {
		Scanner keyboard = new Scanner(System.in);

		int myint = keyboard.nextInt();
		
		listAllmeals();		
		
		System.out.println("Yemek Listesine Dönmek için 1, sepeti görmek için 2:");

		
		if (2 == myint) {
			System.out.println("Yemek Listesi Onaylandý:");
			listBasket();
		} else {
			listAllmeals();
		}
		
		
	}
	
}
