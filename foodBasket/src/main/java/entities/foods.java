package entities;

public abstract class foods {
	public int price;
	public String kind;
	public int index;
	
	public foods(int index,int price, String kind) {
		//super();
		this.index= index;
		this.price = price;
		this.kind = kind;
	}
	
}