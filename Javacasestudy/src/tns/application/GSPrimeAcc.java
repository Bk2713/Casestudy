package tns.application;

import tns.framework.PrimeAcc;
public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	
}

	@Override
	public void bookProducts(float charges) {
	
	System.out.println("You have purchased the product of charges " +charges);
	
	}
}