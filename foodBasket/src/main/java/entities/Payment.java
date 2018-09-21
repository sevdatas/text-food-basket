package entities;

public abstract class Payment {
	public int installmentnum;
	public String paymentname;
	public int index;
	
	public Payment(int index,int installmentnum, String paymentname) {
		//super();
		this.index = index;
		this.installmentnum = installmentnum;
		this.paymentname = paymentname;
	}
	
}
