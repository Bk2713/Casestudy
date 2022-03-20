package tns.application;

import tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}

	@Override
	public void bookProducts(float charges) {
		System.out.println("You have purchased the product of charges " +charges+ " with the delivery charges " + deliverycharges);
	}

}
