package com.main;

import com.categories.AllCategories;
import com.categories.CategorySubtotal;
import com.deposits.CashDeposits;
import com.deposits.CreditCards;
import com.deposits.ExpectedDeposit;
import com.deposits.Housecharge;
import com.deposits.TotalBankDeposit;
import com.deposits.TotalDeposit;
import com.discounts.AllDiscounts;
import com.discounts.DiscountSubTotal;
import com.grossReceipts.AdjustedGrossSales;
import com.grossReceipts.CardCashOut;
import com.grossReceipts.CarriedOver;
import com.grossReceipts.CreditTotals;
import com.grossReceipts.Discounts;
import com.grossReceipts.Donations;
import com.grossReceipts.GiftCardCashOut;
import com.grossReceipts.GiftCardRedeemed;
import com.grossReceipts.GiftCertRedeemed;
import com.grossReceipts.GrossReceipts;
import com.grossReceipts.GrossSales;
import com.grossReceipts.NetSales;
import com.grossReceipts.Non_RevServiceCharge;
import com.grossReceipts.Outstandings;
import com.grossReceipts.Payouts;
import com.grossReceipts.Refunds;
import com.grossReceipts.ServiceCharges;
import com.grossReceipts.SubTotal;
import com.grossReceipts.Tax;
import com.grossReceipts.TipsPaid;
import com.grossReceipts.TotalReceipts;
import com.grossReceipts.Voids;
import com.misc.AvgChecksExp;
import com.misc.AvgGuestExp;
import com.misc.AvgTablesExp;
import com.misc.ChecksCount;
import com.misc.GuestCount;
import com.misc.OverShort;
import com.misc.TablesCount;
import com.misc.TipsDue;
import com.misc.TrainingTotal;
import com.tenders.Amex;
import com.tenders.Amex_OLO;
import com.tenders.Cash;
import com.tenders.CashTips;
import com.tenders.ChargedTips;
import com.tenders.DinersCB;
import com.tenders.Discover;
import com.tenders.Discover_OLO;
import com.tenders.Doordash_OLO;
import com.tenders.Enroute;
import com.tenders.GiftCardValueAdd;
import com.tenders.GiftCardsSold;
import com.tenders.Grubhub_OLO;
import com.tenders.JCB;
import com.tenders.MasterCard;
import com.tenders.MasterCard_OLO;
import com.tenders.OtherServiceCharge;
import com.tenders.OtherTips;
import com.tenders.PaidIn;
import com.tenders.PaidOut;
import com.tenders.Postmates_OLO;
import com.tenders.TotalTips;
import com.tenders.Uber_OLO;
import com.tenders.Visa;
import com.tenders.Visa_OLO;
import com.tenders.eZCater_OLO;
import com.utils.FMReport;
import com.utils.NewFM;

/**
 * @author sandhya
 *
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		 /* Login - sandhya */
		Login l = new Login();
		l.getLogin();
		l.dateSiteSelection();

		
		
		/* Discounts -sandhya */
		Discounts d = new Discounts();
		d.getDiscounts();

		/* Voids -Venkaiah */
		Voids v = new Voids();
		v.getVoids();
		
		/* Refunds -Manikanta */
		Refunds r = new Refunds();
		r.getRefund();

		/* Service Charges -Manikanta */
		ServiceCharges sc = new ServiceCharges();
		sc.getServiceCharges();

		/* Donations -Padmavathi */
		Donations d1 = new Donations();
		d1.getDonations();

		/* Credit Totals -Sandhya */
		CreditTotals ct = new CreditTotals();
		ct.getCreditTotal();

		/* Sub Total -Padmavathi */
		SubTotal st = new SubTotal();
		st.getSubtotal();

		/* Gross Sales -Sandhya */
		GrossSales gs = new GrossSales();
		gs.getGrossSales();

		/* Gross Receipts -Manikanta */
		GrossReceipts grs = new GrossReceipts();
		grs.getGrossReceipts();

		/* Tax -Upendra */
		Tax t = new Tax();
		t.getTax();

		/* Net Sales -Sandhya */
		NetSales ns = new NetSales();
		ns.getNetSales();

		/* Tax -Upendra */
		t.getTax();

		/* Carried Over -Upendra */
		CarriedOver co = new CarriedOver();
		co.getCarriedOver();

		/* Outstandings -Venkaiah */
		Outstandings ot = new Outstandings();
		ot.getOutstandings();

		/* Service Charges -Manikanta */
		ServiceCharges sc1 = new ServiceCharges();
		sc1.getServiceCharges();

		/* Adjusted Gross Sales -Venkaiah */
		AdjustedGrossSales ags = new AdjustedGrossSales();
		ags.getAdjustedGrossSales();

		/* Tips Paid -Manikanta */
		TipsPaid tp = new TipsPaid();
		tp.getTipsPaid();

		/* Card Cash Out -Padmavathi */
		CardCashOut cco = new CardCashOut();
		cco.getCardCashout();

		/* Payouts -Padmavathi */
		Payouts p = new Payouts();
		p.getPayouts();

		/* Non-Rev Service Charge -Sandhya */
		Non_RevServiceCharge nr = new Non_RevServiceCharge();
		nr.getNonRevServiceCharge();

		/* Gift Card Cash Out -Sandhya */
		GiftCardCashOut gcc = new GiftCardCashOut();
		gcc.getGiftCardCashOut();

		/* Total Receipts -Venkaiah */
		TotalReceipts tr = new TotalReceipts();
		tr.getTotalReciepts();

		/* Gift Card Redeemed -Upendra */
		GiftCardRedeemed gcr = new GiftCardRedeemed();
		gcr.getGiftCardRedeemed();

		/* Gift Cert Redeemed -Upendra */
		GiftCertRedeemed gcr1 = new GiftCertRedeemed();
		gcr1.getGiftCertRedeemed();

		/* Cash Deposit #1 to #7 -Venkaiah */
		CashDeposits cd = new CashDeposits();
		cd.getCashDeposit();

		/* Expected Deposit -Manikanta */
		ExpectedDeposit ed = new ExpectedDeposit();
		ed.getExpectedDeposit();

		/* Total Cash Deposits -Padmavathi */
		cd.getTotalCashDeposit();

		/* Total Bank Deposits -Venkaiah */
		TotalBankDeposit tbd = new TotalBankDeposit();
		tbd.getTotalBankDeposit();

		/* Credit Cards -Sandhya */
		CreditCards cc = new CreditCards();
		cc.getCreditCard();

		/* Housecharge -Manikanta */
		Housecharge h = new Housecharge();
		h.getHousecharge();

		/* Total Deposit -Upendra */
		TotalDeposit td = new TotalDeposit();
		td.getTotalDeposit();

		/* Over / Short -Padmavathi */
		OverShort os = new OverShort();
		os.getOverShort();

		/* Training Total -Sandhya */
		TrainingTotal tt = new TrainingTotal();
		tt.getTrainingTotal();

		/* Gift Cards Sold -Venkaiah */
		GiftCardsSold gcs = new GiftCardsSold();
		gcs.getGiftCardsSold();

		/* Tips Due -Upendra */
		TipsDue td1 = new TipsDue();
		td1.getTipsDue();

		/* Categories - generalised -Sandhya & Upendra */
		AllCategories var = new AllCategories();
		var.getAllCategories();

		/* Discounts - generalised -Manikanta & Padmavathi */
		AllDiscounts var1 = new AllDiscounts();
		var1.getAllDiscounts();
		

		/* Cash -Manikanta */
		Cash c = new Cash();
		c.getCash();

		/* Paid IN -Padmavathi */
		PaidIn pi = new PaidIn();
		pi.getPaidIn();

		/* Paid OUT -Sandhya */
		PaidOut po = new PaidOut();
		po.getPaidOut();

		/* Amex -Upendra */
		Amex a = new Amex();
		a.getAmex();

		/* Diners/CB -Venkaiah */
		DinersCB dc = new DinersCB();
		dc.getDinersCB();

		/* Discover -Manikanta */
		Discover d2 = new Discover();
		d2.getDiscover();

		/* Enroute -Padmavathi */
		Enroute e = new Enroute();
		e.getEnroute();

		/* JCB -Sandhya */
		JCB j = new JCB();
		j.getJCB();

		/* Master Card -Upendra */
		MasterCard m = new MasterCard();
		m.getMastercard();

		/* Visa -Venkaiah */
		Visa v1 = new Visa();
		v1.getVisa();

		/* Amex-OLO -Manikanta */
		Amex_OLO ao = new Amex_OLO();
		ao.getAmex_OLO();

		/* Discover-OLO -PAdmavathi */
		Discover_OLO dso = new Discover_OLO();
		dso.getDiscoverOLO();

		/* Doordash-OLO -Sandhya */
		Doordash_OLO ddo = new Doordash_OLO();
		ddo.getDoordashOLO();

		/* eZCater-OLO -Upendra */
		eZCater_OLO ez = new eZCater_OLO();
		ez.getEzcater_OLO();

		/* Grubhub-OLO -Venkaiah */
		Grubhub_OLO gr = new Grubhub_OLO();
		gr.getGrubhub_OLO();

		/* Master Card-OLO -Manikanta */
		MasterCard_OLO mo = new MasterCard_OLO();
		mo.getMasterCard_OLO();

		/* Postmates-OLO -Padmavathi */
		Postmates_OLO pmo = new Postmates_OLO();
		pmo.getPostmates_OLO();

		/* Uber-OLO -Sandhya */
		Uber_OLO uo = new Uber_OLO();
		uo.getUber_OLO();

		/* Visa-OLO -Upendra */
		Visa_OLO vo = new Visa_OLO();
		vo.getVisaOLO();

		/* Gift cards Sold -Venkaiah */
		gcs.getGiftCardsSold();

		/* GC Value Add -Manikanta */
		GiftCardValueAdd gcv = new GiftCardValueAdd();
		gcv.getGCValueAdd();

		/* GC Cash Out -Padmavathi */
		gcc.getGiftCardCashOut();

		/* Donations -Venkaiah */
		d1.getDonations();

		/* Other Service Charge -Manikanta */
		OtherServiceCharge osc = new OtherServiceCharge();
		osc.getOtherServiceCharge();

		/* Charged Tips -Sandhya */
		ChargedTips ct1 = new ChargedTips();
		ct1.getChargedTips();

		/* Other Tips -Upendra */
		OtherTips ot1 = new OtherTips();
		ot1.getOtherTips();

		/* Cash Tips -Padmavathi */
		CashTips ct2 = new CashTips();
		ct2.getCashTips();

		/* Total Tips -Venkaiah */
		TotalTips tt1 = new TotalTips();
		tt1.getTotalTips();

		/* Guest Count -Padmavathi */
		GuestCount gc = new GuestCount();
		gc.getGuestCount();

		/* Avg. Guest Exp -Sandhya */
		AvgGuestExp ag = new AvgGuestExp();

		/* Checks Count -Upendra */
		ChecksCount cc1 = new ChecksCount();
		cc1.getChecksCount();

		/* Avg. Checks Exp -Venkaiah */
		AvgChecksExp ace = new AvgChecksExp();

		/* Tables Count -Manikanta */
		TablesCount tc = new TablesCount();
		tc.getTablesCount();

		/* Avg. Tables Exp -Padmavathi */
		AvgTablesExp at = new AvgTablesExp();
		at.getAvgTablesExp();

		QuitBrowser qb = new QuitBrowser();
		qb.getQuiBrowser();

	}

}
