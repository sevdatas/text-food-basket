package entities;

public abstract class payment {
	public int installmentnum;
	public String paymentname;
	
	public payment(int installmentnum, String paymentname) {
		//super();
		this.installmentnum = installmentnum;
		this.paymentname = paymentname;
	}
	
}
