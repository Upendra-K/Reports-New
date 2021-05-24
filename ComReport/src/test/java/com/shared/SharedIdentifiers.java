package com.shared;

public class SharedIdentifiers {

	public static final String NAME_EMAIL = "email";
	public static final String NAME_PASSWORD = "password";
	public static final String NAME_LOGIN = "login";
	public static final String ID_DATE_PICKER = "datepicker";
	public static final String ID_DATE_PICKER1 = "datepicker1";
	public static final String XPATH_SITES_DROPDOWN = "//a[@class = 'textbox-icon combo-arrow']";
	public static final String XPATH_SITE_IHOP_1753 = "//span[contains(text(),'IHOP #1753')]";
	public static final String XPATH_SITE_IHOP_925 = "//span[contains(text(),'IHOP #925')]";
	public static final String ID_RUN_REPORT = "formsubmitbutton";

	/* Void Report */
	public static final String XPATH_VOID_REPORT_TOTAL = "//td[contains(text(),'Total')]/following-sibling::td[2]";

	/* Refund Report */
	public static final String XPATH_REFUND_REPORT_TOTALS = "//td[contains(text(), 'Totals')]/following-sibling::td";

	/* Sales Report */
	public static final String XPATH_SALES_REPORT_BASE = "//td[contains(text(),'Totals')]/following-sibling::td[17]";
	public static final String XPATH_SALES_REPORT_TAX = "//td[contains(text(),'Totals')]/following-sibling::td[18]";

	/* Payments Report */
	public static final String XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT = "//*[contains(text(),'Tender Type : ')]/following-sibling::div";
	public static final String XPATH_CARD_TYPE_IN_PAYMENTS_REPORT = "//*[contains(text(), 'Card Type : ')]/following-sibling::div";
	public static final String XPATH_SERVICE_TYPE_IN_PAYMENTS_REPORT = "//*[contains(text(),'Service : ')]/following-sibling::div";
	public static final String XPATH_SERVICE_TYPE_OLO = "//label[contains(text(),'OLO')]";
	public static final String XPATH_SERVICE_TYPE_OlO = "//label[contains(text(),'OlO')]";
	public static final String XPATH_TENDER_TYPE_CASH = "//label[contains(text(),'Cash')]";
	public static final String XPATH_TENDER_TYPE_CARD = "//label[contains(text(),' Card')]";
	public static final String XPATH_CARD_TYPE_AMEX = "//label[contains(text(),' AMEX')]";
	public static final String XPATH_CARD_TYPE_DINERSCLUB = "//label[contains(text(),' DINERSCLUB')]";
	public static final String XPATH_CARD_TYPE_DISCOVER = "//label[contains(text(),' DISCOVER')]";
	public static final String XPATH_CARD_TYPE_ENROUTE = "//label[contains(text(),' ENROUTE')]";
	public static final String XPATH_CARD_TYPE_JCB = "//label[contains(text(),' JCB')]";
	public static final String XPATH_CARD_TYPE_MASTERCARD = "//label[contains(text(),' MASTERCARD')]";
	public static final String XPATH_CARD_TYPE_VISA = "//label[contains(text(),' VISA')]";
	public static final String XPATH_TENDER_TYPE_DOORDASH_OLO = "//label[contains(text(),' doordash')]";
	public static final String XPATH_TENDER_TYPE_EZCATER_OLO = "//label[contains(text(),'Catering')]";
	public static final String XPATH_TENDER_TYPE_GRUBHUB_OLO = "//label[contains(text(),' grubhub')]";
	public static final String XPATH_TENDER_TYPE_POSTMATES_OLO = "//label[contains(text(),'postmates')]";
	public static final String XPATH_TENDER_TYPE_UBER_OLO = "//label[contains(text(),' uber')]";
	public static final String XPATH_PAYMENTS_REPORT_TIPS = "//td[contains(text(),'Totals')]/following-sibling::td[3]";
	public static final String XPATH_PAYMENTS_REPORT_TOTALS = "//*[contains(text(), 'Totals')]/following-sibling::td[4]";

	/* No Sale Report */
	public static final String XPATH_REASON_IN_NOSALE_REPORT = "//*[contains(text(),'Reasons: ')]/following-sibling::div";
	public static final String XPATH_REASON_PAID_OUT = "//label[contains(text(),' PAID OUT')]";
	public static final String XPATH_REASON_PAID_IN = "//td[contains(text(),'PAID IN')]";
	public static final String XPATH_NOSALE_REPORT_TOTALS = "//*[contains(text(), 'Totals')]/following-sibling::td";

	/* Gift Card Report */
	public static final String XPATH_TRANSACTION_TYPE_IN_GIFTCARD_REPORT = "//*[contains(text(), 'Transaction type : ')]/following-sibling::div";
	public static final String XPATH_TRANSACTION_TYPE_CASH_OUT = "//label[contains(text(), 'Cash out')]";
	public static final String XPATH_TRANSACTION_TYPE_CHARGE = "//label[contains(text(), ' Charge')]";
	public static final String XPATH_TRANSACTION_TYPE_ISSUE = "//label[contains(text(), 'Issue')]";
	public static final String XPATH_TRANSACTION_TYPE_RELOAD = "//label[contains(text(), 'Reload')]";
	public static final String XPATH_GIFTCARD_REPORT_TOTALS = "//td[contains(text(), 'Totals')]/following-sibling::td";

	/* Cash Owed Report */
	public static final String XPATH_STAFF_IN_CASHOWED_REPORT = "//div[contains(text(), 'Staff')]/following-sibling::div";
	public static final String XPATH_SELECT_ALL_STAFF_IN_CASHOWED_REPORT = "//div[contains(text(), 'Staff')]/following-sibling::div//label[contains(text(), 'All')]";
	public static final String XPATH_CASHOWED_REPORT_TOTALS = "//b[contains(text(), 'Totals')]/parent::td//following-sibling::td[7]";

//***************************************************By Category Report**********************************************************//

	/* Bevarages */
	public static final String XPATH_BEVARAGES_CATEGORY = "//td[contains(text(),'Beverages')]/following-sibling::td[2]";

	/* Breakfast */
	public static final String XPATH_SENIOR_BREAKFAST_CATEGORY = "//td[text()='Senior-Breakfast']/following-sibling::td[2]";
	public static final String XPATH_SIDES_BREAKFAST_CATEGORY = "//td[text()='Sides-Breakfast']/following-sibling::td[2]";
	public static final String XPATH_OMELETTES_CATEGORY = "//td[text()='Omelettes']/following-sibling::td[2]";
	public static final String XPATH_COMBOS_CATEGORY = "//td[text()='Combos']/following-sibling::td[2]";
	public static final String XPATH_3_EGG_BRKFST_CATEGORY = "//td[text()='3 Egg Brkfst']/following-sibling::td[2]";
	public static final String XPATH_PANCAKES_CATEGORY = "//td[text()='Pancakes']/following-sibling::td[2]";
	public static final String XPATH_MEATS_CATEGORY = "//td[text()='Meats']/following-sibling::td[2]";
	public static final String XPATH_SIDES_FRIED_CATEGORY = "//td[text()='Sides - Fried']/following-sibling::td[2]";
	public static final String XPATH_EGG_CATEGORY = "//td[text()='Egg']/following-sibling::td[2]";
	public static final String XPATH_SIDES_OTHER_CATEGORY = "//td[text()='Sides-Other']/following-sibling::td[2]";
	public static final String XPATH_KIDS_BREAKFAST_CATEGORY = "//td[text()='Kids-Breakfast']/following-sibling::td[2]";
	public static final String XPATH_BLINTZ_CREPES_CATEGORY = "//td[text()='Blintz/Crepes']/following-sibling::td[2]";
	public static final String XPATH_SANDWICHES_CATEGORY = "//td[text()= 'Sandwiches']/following-sibling::td[2]";

	/* Food-AB */
	public static final String XPATH_FRENCH_TOAST_CATEGORY = "//td[text()='French Toast']/following-sibling::td[2]";
	public static final String XPATH_SENIOR_AB_CATEGORY = "//td[text()='Senior-A.B.']/following-sibling::td[2]";
	public static final String XPATH_SOUPS_SALADS_CATEGORY = "//td[text()='Soups/Salads']/following-sibling::td[2]";
	public static final String XPATH_APPETIZERS_CATEGORY = "//td[text()='Appetizers']/following-sibling::td[2]";
	public static final String XPATH_BURGERS_CATEGORY = "//td[text()='Burgers']/following-sibling::td[2]";
	public static final String XPATH_DINNERS_CATEGORY = "//td[text()='Dinners']/following-sibling::td[2]";
	public static final String XPATH_WAFFLES_CATEGORY = "//td[text()='Waffles']/following-sibling::td[2]";
	public static final String XPATH_KIDS_AB_CATEGORY = "//td[text()='Kids -A.B.']/following-sibling::td[2]";
	public static final String XPATH_SIDES_AB_CATEGORY = "//td[text()='Sides-A.B.']/following-sibling::td[2]";

	/* Merchandise */
	public static final String XPATH_GIFT_CARD_CATEGORY = "//td[contains(text(),'Gift Card')]/following-sibling::td[2]";

	/* Other */
	public static final String XPATH_OTHER_CATEGORY = "//td[text()='Other']/following-sibling::td[2]";

	/* Discount Report */
	public static final String XPATH_REPORT_TYPE_IN_DISCOUNT_REPORT = "//select[@id='reportType']";
	public static final String XPATH_REPORT_TYPE_DETAILED = "//option[contains(text(), 'Detailed')]";
	public static final String XPATH_DISCOUNT_REPORT_TOTALS = "//td[contains(text(),'Totals')]/following-sibling::td";
	public static final String XPATH_DISCOUNT_NAME_IN_DISCOUNT_REPORT = "//div[contains(text(), 'Discount Name')]/following-sibling::div//span[contains(text(), 'Select')]";

//**************************************Different Discount Report*************************************************************//

	/* Coupon Discount */
	public static final String XPATH_FREE_MUMMY_PANCAKE_DISCOUNT = "//label[contains(text(), ' Free Mummy Pancake')]";
	public static final String XPATH_KIDS_EAT_FREE_DISCOUNT = "//label[contains(text(), ' KidsEatFree')]";
	public static final String XPATH_COUPON_OPEN_DISCOUNT = "//label[contains(text(), ' Coupon Open')]";
	public static final String XPATH_COMMUNITY_10_PERCENT_DISCOUNT = "//label[contains(text(), ' Community 10%')]";
	public static final String XPATH_BOUNCE_BACK_DISCOUNT = "//label[contains(text(), ' Bounce Back')]";
	public static final String XPATH_BOGO_DISCOUNT = "//label[contains(text(), ' BOGO')]";
	public static final String XPATH_VOG_SSTACK_DISCOUNT = "//label[contains(text(), ' VOG SSTACK')]";
	public static final String XPATH_PANREV_WELCOME_DISCOUNT = "//label[contains(text(), ' PanRev Welcome')]";
	public static final String XPATH_PANREV_BDAY_DISCOUNT = "//label[contains(text(), ' PanRev Bday')]";
	public static final String XPATH_PANREV_ANNIV_DISCOUNT = "//label[contains(text(), ' PanRev Anniv')]";
	public static final String XPATH_VOG_BEV_DISCOUNT = "//label[contains(text(), ' VOG Bev')]";
	public static final String XPATH_COUPON_15_PERCENT_DISCOUNT = "//label[contains(text(), ' Coupon 15%')]";
	public static final String XPATH_COUPON_20_PERCENT_DISCOUNT = "//label[contains(text(), ' Coupon 20%')]";
	public static final String XPATH_BOGO_SHAKE_DISCOUNT = "//label[contains(text(), ' BOGO Shake')]";
	public static final String XPATH_FAMILY_10_PERCENT_DISCOUNT = "//label[contains(text(), ' Family 10%')]";
	public static final String XPATH_VOG_$5_DISCOUNT = "//label[contains(text(), ' VOG $5')]";
	public static final String XPATH_COUPON_10_PERCENT_DISCOUNT = "//label[contains(text(), ' Coupon 10%')]";
	public static final String XPATH_FAMILY_20_PERCENT_DISCOUNT = "//label[contains(text(), ' Family 20%')]";

	/* Emp Discount */
	public static final String XPATH_EMPLOYEE_MEAL_DISCOUNT = "//label[contains(text(), ' Employee Meal')]";
	public static final String XPATH_EMPLOYEE_$10_DISCOUNT = "//label[contains(text(), ' Employee $10')]";

	/* Gov Discount */
	public static final String XPATH_MILITARY_15_PERCENT_DISCOUNT = "//label[contains(text(), ' Military 15%')]";
	public static final String XPATH_1ST_RESP_10_PERCENT_DISCOUNT = "//label[contains(text(), ' 1st Resp 10%')]";
	public static final String XPATH_1ST_RESP_20_PERCENT_DISCOUNT = "//label[contains(text(), ' 1st Resp 20%')]";
	public static final String XPATH_1ST_RESP_25_PERCENT_DISCOUNT = "//label[contains(text(), ' 1st Resp 25%')]";
	public static final String XPATH_1ST_RESP_50_PERCENT_DISCOUNT = "//label[contains(text(), ' 1st Resp 50%')]";
	public static final String XPATH_POLICE_100_PERCENT_DISCOUNT = "//label[contains(text(), ' Police 100%')]";
	public static final String XPATH_MILITARY_10_PERCENT_DISCOUNT = "//label[contains(text(), ' Military 10%')]";

	/* Manager Discount */
	public static final String XPATH_OPEN_DISC_DISCOUNT = "//label[contains(text(), ' Open Disc')]";
	public static final String XPATH_MGR_COMP_DISCOUNT = "//label[contains(text(), ' Mgr Comp')]";
	public static final String XPATH_MGR_MEAL_DISCOUNT = "//label[contains(text(), ' Mgr Meal')]";

	/* Senior Discount */
	public static final String XPATH_SENIOR_20_PERCENT_DISCOUNT = "//label[contains(text(), 'Senior 20%')]";
	public static final String XPATH_SENIOR_10_PERCENT_DISCOUNT = "//label[contains(text(), 'Senior 10%')]";
	public static final String XPATH_SENIOR_25_PERCENT_DISCOUNT = "//label[contains(text(), 'Senior 25%')]";
	public static final String XPATH_SENIOR_50_PERCENT_DISCOUNT = "//label[contains(text(), 'Senior 50%')]";

}
