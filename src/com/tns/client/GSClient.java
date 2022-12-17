package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;

public class GSClient {

	public static void main(String[] args) {
		GSShopFactory factory=new GSShopFactory();
		GSNormalAcc gsn=(GSNormalAcc)factory.getNewNormalAccount(1212, "padmini", 600.00f);
		gsn.bookProduct(gsn.getCharges());
		GSPrimeAcc gsp=(GSPrimeAcc) factory.getNewPrimeAccount(12122, "suresh", 500.00f, true);
		gsp.bookProduct(gsp.getCharges());
	}

}
