package tns.application;

import tns.framework.NormalAcc;
import tns.framework.PrimeAcc;
import tns.framework.ShopFactory;

public class client {

	public static void main(String[] args) {
		ShopFactory sf=new GSShopFactory();
		PrimeAcc pa=new GSPrimeAcc(123,"bala",100);
		pa.bookProducts(500);
		NormalAcc na=new GSNormalAcc(1234, "sanjana", 0);
		na.bookProducts(900);

	}

}
