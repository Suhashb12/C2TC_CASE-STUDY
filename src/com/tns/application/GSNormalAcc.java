package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	
		@Override
		public void bookProduct(float charges)
		{
			
		}

	

	public GSNormalAcc(float deliverycharges) {
		super(deliverycharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	public float getcharges() {
		// TODO Auto-generated method stub
		return 0;
	}

}
