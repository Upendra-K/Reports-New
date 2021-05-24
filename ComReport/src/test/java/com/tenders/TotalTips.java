package com.tenders;

import com.main.Login;
import com.shared.AllSharedValues;

/**
 * @author Venkaiah
 *
 */
public class TotalTips extends Login {

	public void getTotalTips() {
		float totaltips = AllSharedValues.chargedtips + AllSharedValues.othertips + AllSharedValues.cashtips;
		AllSharedValues.totaltips = Float.valueOf(totaltips);
		System.out.println("Total Tips= " + totaltips);
	}

}
