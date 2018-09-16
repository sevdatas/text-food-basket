package entities;

public abstract class payment {
	public int installmentnum;
	public String paymentname;
	public int index;
	
	public payment(int index,int installmentnum, String paymentname) {
		//super();
		this.index = index;
		this.installmentnum = installmentnum;
		this.paymentname = paymentname;
	}
	
}
