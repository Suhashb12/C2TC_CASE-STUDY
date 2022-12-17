package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{
PrimeAcc acc1;
NormalAcc acc2;
	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, Float charges, Boolean isPrime) 
	{
		acc1=new GSPrimeAcc(AccNo,accNm,charges,isPrime);
		return acc1;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, Float charges)
	{
		acc2=new GSNormalAcc(AccNo,accNm,charges);
		return acc2;
	
    }
}
