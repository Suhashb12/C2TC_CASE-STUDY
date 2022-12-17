package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;

public class GSClient {

	public static void main(String[] args) {
		GSShopFactory factory=new GSShopFactory();
		GSNormalAcc gsn=(GSNormalAcc)factory.getNewNormalAccount(1212,"suhas", 600.00f);
        gsn.bookProduct(gsn.getcharges());
		GSPrimeAcc gsp=(GSPrimeAcc)factory.getNewPrimeAccount(12122, "suresh", 500.0f, true);
		gsp.bookProduct(gsp.getcharges());	
	}

}
