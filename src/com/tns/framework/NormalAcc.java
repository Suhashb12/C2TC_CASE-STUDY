package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	public NormalAcc(float deliverycharges) {
		super();
		this.deliverycharges = deliverycharges;
	}
	private float deliverycharges=50;
	@Override
	public void bookProduct(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + deliverycharges + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
