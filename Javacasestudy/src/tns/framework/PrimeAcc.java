package tns.framework;

public class PrimeAcc extends ShopAcc {
	public PrimeAcc(int accno,String accname, float charges) {
		super(accno,accname,charges);
	}
	
	
	private boolean isprime=true;

	public boolean isIsprime() {
		return isprime;
	}

	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}

	

}
