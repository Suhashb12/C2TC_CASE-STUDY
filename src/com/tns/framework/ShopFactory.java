package com.tns.framework;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAccount(int AccNo,String AccNm,float charges,boolean isprime);
	public abstract NormalAcc getNewNormalAccount(int AccNo,String AccNm,float charges);
}
