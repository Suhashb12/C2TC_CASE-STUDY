package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isprime;
	private static final float deliverycharges=0;
	
	public PrimeAcc(int AccNo, String AccNm, float charges, boolean isprime) {
		super(AccNo, AccNm, charges);
		this.isprime(isprime);
	}
	public float getdelivarycharges()
	{
		return delivarycharges;
	}
	@Override
	public void bookProduct(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isprime=" + isprime + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
