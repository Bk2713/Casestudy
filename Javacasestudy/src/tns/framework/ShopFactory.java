package tns.framework;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAccount(int accno,String accname, float charges);

	public NormalAcc getNewnormalAccount(int accno,String accname, float charges);

}
