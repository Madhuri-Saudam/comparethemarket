package com.ctm.qa.ctmtechtest;

import org.testng.Assert;
import org.testng.annotations.*;

import com.ctm.qa.ctmtechtest.base.*;
import com.ctm.qa.ctmtechtest.pages.*;


public class CompareEnergyTest extends TestBase {

	CEYourSupplierPage supplierpage;
	CEYourEnergyPage energypage;
	CEYourDetailsPage detailspage;
	CEYourResultsPage resultspage;
	
	public CompareEnergyTest() {
		
		super();
	}
	
 @BeforeMethod
 public void setUp() {
	 
	 Initialization();
	 supplierpage = new CEYourSupplierPage();
	 energypage = new CEYourEnergyPage();
	 detailspage = new CEYourDetailsPage();
	 resultspage = new CEYourResultsPage();
 }
	
 @Test
 public void compareGasSupplierWithoutBill() {
	
	 String supplypageTitle = supplierpage.getCEYourSupplierPageTitle();
	 Assert.assertEquals(supplypageTitle , "Energy - Compare Gas and Electricity Suppliers | Compare The Market");
	 
	 supplierpage.enterPostCode();
	 	
	 Assert.assertTrue(supplierpage.clickNoIDontHaveMyBill());
	
	 Assert.assertTrue(supplierpage.selectGasOnly());
	
	 supplierpage.selectEnergyGas();
	 
	 supplierpage.clickNext();
	 
	 Assert.assertTrue(energypage.selectPrePaymentMeterNoCheckBox());
	 
	 Assert.assertTrue(energypage.selectIDontKnowSpendOnGasCheckBox());
	 
	 energypage.clickNext();
	 
	 Assert.assertTrue(energypage.selectsizeOfHome());
	 
	 Assert.assertTrue(energypage.selectNoOfOccupants());
	 
	 Assert.assertTrue(energypage.selectMainSourceForHetingGas());
	 
	 Assert.assertTrue(energypage.selectAtHomeTemperate());
	 
	 Assert.assertTrue(energypage.selectinsulationAtHome());
	 
	 Assert.assertTrue(energypage.selectmainSourceForCookingGas());
	 
	 Assert.assertTrue(energypage.selectsomeoneAtHomeMostOfTheTime());
	 
	 energypage.clickYourDetails();
	 
	 Assert.assertTrue(detailspage.selectFixedTarrif());
	 
	 Assert.assertTrue(detailspage.selectAllPaymentTypes());
	 
	 detailspage.enterEmail();
	 
	 Assert.assertTrue(detailspage.selectAgreeTermsAAndConditionsCheck());
	 
	 detailspage.clickGoToPrices();
	 String resultspageTitle = resultspage.getCEYourResultsPageTitle();
	 Assert.assertEquals(resultspageTitle , "Energy - Compare Gas and Electricity Suppliers | Compare The Market"); 
		 
		 
 }
 

 @Test
 public void compareElectricitySupplierWithoutBill() {
	
	 String supplypageTitle = supplierpage.getCEYourSupplierPageTitle();
	 Assert.assertEquals(supplypageTitle , "Energy - Compare Gas and Electricity Suppliers | Compare The Market");
	 	 
	 supplierpage.enterPostCode();
	 
	 Assert.assertTrue(supplierpage.clickNoIDontHaveMyBill());
	 
	 Assert.assertTrue(supplierpage.selectElectricityOnly());
	 
	 Assert.assertTrue(supplierpage.selectEngerySupplierElectricity());
	 
	 supplierpage.clickNext();
	 
	 Assert.assertTrue(energypage.selectPrePaymentMeterNoCheckBox());
	 
	 Assert.assertTrue(energypage.selectEconomyMeterYes());
	 
	 energypage.enterCurrentSpendOnElectricity();
	 	 
	 energypage.selectElectricityCurrentSpendPeriod();
	 
	 energypage.clickNext();
	 		 
	 Assert.assertTrue(detailspage.selectVariableTariff());
	 
	 Assert.assertTrue(detailspage.selectMonthlyDirectDebit());
	 
	 detailspage.enterEmail();
	 
	 Assert.assertTrue(detailspage.selectAgreeTermsAAndConditionsCheck());
	 
	 detailspage.clickGoToPrices();
	 String resultspageTitle = resultspage.getCEYourResultsPageTitle();
	 Assert.assertEquals(resultspageTitle , "Energy - Compare Gas and Electricity Suppliers | Compare The Market"); 
		 
 }
 
 
 @Test
 public void compareGasAndElectricitySuppliersWithBill() {
	
	 String supplypageTitle = supplierpage.getCEYourSupplierPageTitle();
	 Assert.assertEquals(supplypageTitle , "Energy - Compare Gas and Electricity Suppliers | Compare The Market");
	 
	 supplierpage.enterPostCode();
	 
	 Assert.assertTrue(supplierpage.clickYesIHaveMyBill());
	 
	 Assert.assertTrue(supplierpage.selectGasandElectricity());
	 
	 Assert.assertTrue(supplierpage.selectNotSameSupplier());
	 
	 supplierpage.selectEnergyElectric();
	 
	 Assert.assertTrue(supplierpage.selectEngerySupplierGas());
	 
	 supplierpage.clickNext();
	 
	 energypage.selectElectricityPlan();
	 
	 Assert.assertTrue(energypage.selectEconomyMeterYes());
	 
	 energypage.selectElectricityPaymentMethodDropDown();
	 
	 Assert.assertTrue(energypage.selectElectricityMainSourceHeatingNo());
	 
	 Assert.assertTrue(energypage.selectElectricityUsagekWh());
	 
	 energypage.selecteconomyElectricityUsageDay();
	 
	 energypage.selecteconomyElectricityUsageDropDown();
	 
	 energypage.selecteconomyElectricityUsageNight();
	 
	 energypage.selectElectricityBillDate();
	 
	 energypage.clickNext();
	 
	 energypage.selectGasTariffDropDown();
	 
	 energypage.selectGasPaymentMethodDropDown();
	 
	 Assert.assertTrue(energypage.selectGasMainSourceHeatingYes());
	 
	 Assert.assertTrue(energypage.selectGasUsagePound());
	 
	 energypage.selectGasUsagePoundValue();
	 
	 energypage.selectGasSpendDropDown();;
	 
	 energypage.selectGasBillDate();
	 
	 energypage.clickNext();
	 
	 Assert.assertTrue(detailspage.selectAllTarrif());
	 
	 Assert.assertTrue(detailspage.selectPayOnReceiptOfBill());
	 
	 detailspage.enterEmail();
	 
	 Assert.assertTrue(detailspage.selectAgreeTermsAAndConditionsCheck());
	 
	 detailspage.clickGoToPrices();
	 String resultspageTitle = resultspage.getCEYourResultsPageTitle();
	 Assert.assertEquals(resultspageTitle , "Energy - Compare Gas and Electricity Suppliers | Compare The Market"); 
		 	 
 }
 
 @AfterMethod
 public void tearDown() {
	 
	 //driver.quit();
 }
 
	
}
