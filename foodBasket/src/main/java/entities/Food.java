package entities;

public abstract class Food {
	public int price;
	public String kind;
	
	public Food(int price, String kind) {
		//super();
		this.price = price;
		this.kind = kind;
	}
	
}