package com.tns.framework;

public abstract class ShopAcc {
	private int AccNo;
	private String AccNm;
	private float charges;

	public void bookProduct(float charges)
	{
		
	}
	public void items(float charges)
	{
		 
	}
	@Override
	public String toString() {
		return "ShopAcc [AccNo=" + AccNo + ", charges=" + charges + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
