package com.ctm.qa.ctmtechtest.pages;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ctm.qa.ctmtechtest.base.TestBase;

public class CEYourEnergyPage extends TestBase {
	
	TestBase testbase;
	//PageFactory
	@FindBy(xpath = "//*[@id=\"electricity-tariff-additional-info\"]")
	WebElement electricityPlanDropDown;
	
	@FindBy(xpath = "//*[@id=\"prepay-yes-no\"]/div/div/label[1]/span")
	WebElement economyMeterYes;
	
	@FindBy(xpath = "/html/body/div/div/main/section[1]/fieldset[2]/div/div/label[1]/span")
	WebElement economyMeterYesElectricity;
	
	@FindBy(xpath = "//*[@id=\"economy-7-no\"]")
	WebElement economyMeterNo;
	
	@FindBy(xpath = "//*[@id=\"electricity-payment-method-dropdown-link\"]")
	WebElement electricityPaymentMethodDropDown;
	
	@FindBy(xpath = "//*[@id=\"electricity-main-heating-yes\"]")
	WebElement electricityMainSourceHeatingYes;
	
	@FindBy(xpath = "/html/body/div/div/main/section[1]/fieldset[4]/div/div/label[2]/span")
	WebElement electricityMainSourceHeatingNo;
	
	@FindBy(xpath = "/html/body/div/div/main/section[1]/fieldset[5]/div/div/div[1]/label[1]/span")
	WebElement electricityUsagekWhCheckBox;
	
	@FindBy(xpath = "//*[@id=\"electricity-usage\"]")
	WebElement electricityUsagekWhValue;
	
	@FindBy(xpath = "//*[@id=\"economy-7-day-usage\"]")
	WebElement economyElectricityUsageDay;
	
	@FindBy(xpath = "//*[@id=\"economy-7-night-usage\"]")
	WebElement economyElectricityUsageNight;
	
	@FindBy(xpath = "//*[@id=\"economy-7-day-usage-dropdown\"]")
	WebElement economyElectricityUsageDropDown;
	
	@FindBy(xpath = "//*[@id=\"electricity-usage-dropdown\"]")
	WebElement electricityUsageDropDown;
	
	@FindBy(xpath = "//*[@id=\"poundSpend\"]")
	WebElement electricityUsagePound;
	
	@FindBy(xpath = "//*[@id=\"electricity-spend\"]")
	WebElement electricityUsagePoundValue;
	
	@FindBy(xpath = "//*[@id=\"electricity-spend-dropdown\"]")
	WebElement electricitySpendDropDown;	
	
	@FindBy(xpath = "/html/body/div/div/main/section[1]/fieldset[8]/div/div/span[1]")
	WebElement calender;
	
	@FindBy(xpath = "/html/body/div/div/main/section[1]/fieldset[8]/div/div/div[1]/div/div/div/div/div/div[1]/div[3]")
	WebElement previousMonth;
	
	@FindBy(xpath = "//*[@id=\"electricity-bill-day_table\"]")
	WebElement calenderTable;
	
	@FindBy(xpath = "//*[@id=\"gas-tariff-additional-info\"]")
	WebElement gasTariffDropDown;
	
	@FindBy(xpath = "//*[@id=\"gas-payment-method-dropdown-link\"]")
	WebElement gasPaymentMethodDropDown;
	
	@FindBy(xpath = "/html/body/div/div/main/section[2]/fieldset[3]/div/div/label[1]/span")
	WebElement gasMainSourceHeatingYes;
	
	@FindBy(xpath = "//*[@id=\"gas-main-heating-no\"]")
	WebElement gasMainSourceHeatingNo;
	
	@FindBy(xpath = "//*[@id=\"kwhSpendG\"]")
	WebElement gasUsagekWhCheckBox;
	
	@FindBy(xpath = "/html/body/div/div/main/section[2]/fieldset[4]/div/div/div[1]/label[2]/span")
	WebElement gasUsagePoundCheckBox;
	
	@FindBy(xpath = "//*[@id=\"gas-usage\"]")
	WebElement gasUsagekWhValue;
	
	@FindBy(xpath = "//*[@id=\"type-of-Gas-bill-usage-dropdown\"]")
	WebElement gasUsagedropDown;
	
	@FindBy(xpath = "//*[@id=\"gas-spend\"]")
	WebElement gasUsagePoundValue;
	
	@FindBy(xpath = "//*[@id=\"type-of-Gas-bill-dropdown\"]")
	WebElement gasSpendDropDown;	
	
	@FindBy(xpath = "//*[@id=\"gas-bill-day\"]")
	WebElement gasBillDate;
	
	@FindBy(xpath = "/html/body/div/div/main/section[2]/fieldset[5]/div/div/span[1]")
	WebElement gascalender;
	
	@FindBy(xpath = "/html/body/div/div/main/section[2]/fieldset[5]/div/div/div[1]/div/div/div/div/div/div[1]/div[3]")
	WebElement gaspreviousMonth;
	
	@FindBy(xpath = "//*[@id=\"gas-bill-day_table\"]")
	WebElement gascalenderTable;
	
	@FindBy(xpath = "//*[@id=\"prepayment-yes\"]")
	WebElement prePaymentMeterYesCheckBox;
	
	@FindBy(xpath = "/html/body/div/div/main/section/div/fieldset[1]/div/div/label[2]/span")
	WebElement prePaymentMeterNoCheckBox;
	
	@FindBy(xpath = "//*[@id=\"electricity-current-spend\"]")
	WebElement currentSpendOnElectricity;
	
	@FindBy(xpath = "//*[@id=\"electricity-current-spend-period\"]")
	WebElement electricityCurrentSpendPeriod;
	
	@FindBy(xpath = "//*[@id=\"electricity-dont-know-check\"]")
	WebElement IDontKnowSpendOnElectricityCheckBox;
	
	@FindBy(xpath = "//*[@id=\"gas-current-spend\"]")
	WebElement currentSpendOnGas;
	
	@FindBy(xpath = "//*[@id=\"gas-current-spend-period\"]")
	WebElement gasCurrentSpendPeriod;
	
	@FindBy(xpath = "//*[@id=\"gas-dont-know-check\"]")
	WebElement IDontKnowSpendOnGasCheckBox;
	
	@FindBy(xpath = "//*[@id=\"goto-your-energy\"]") 
	WebElement nextButton;
	
	@FindBy(xpath = "//*[@id=\"goto-person-details-button\"]")
	WebElement clickYourDetails;
	
	@FindBy(xpath = "/html/body/div/div/main/section/fieldset[1]/div/div/label[1]/span/span")
	WebElement sizeOfHome;
	
	@FindBy(xpath = "/html/body/div/div/main/section/fieldset[2]/div/div/label[2]/span/span")
	WebElement noOfOccupants;
	
	@FindBy(xpath = "/html/body/div/div/main/section/fieldset[3]/div/div/label[1]/span")
	WebElement mainSourceForHetingGas;
	
	@FindBy(xpath = "/html/body/div/div/main/section/fieldset[4]/div/div/label[2]/span")
	WebElement atHomeTemperate;
	
	@FindBy(xpath = "/html/body/div/div/main/section/fieldset[5]/div/div/label[2]/span")
	WebElement insulationAtHome;
	
	@FindBy(xpath = "/html/body/div/div/main/section/fieldset[6]/div/div/label[1]/span")
	WebElement mainSourceForCookingGas;
	
	@FindBy(xpath = "/html/body/div/div/main/section/fieldset[7]/div/div/label[3]/span")
	WebElement someoneAtHomeMostOfTheTime;
	
	
	
	// Initialisation
		public CEYourEnergyPage() {
			
			PageFactory.initElements(driver, this);	
			testbase = new TestBase();
		}
		
		//Actions
		
		public String getCEYourEnergyrPageTitle() {
			
			return driver.getTitle();
		}
		
		public void selectElectricityPlan() {
			
			Select sel = new Select(electricityPlanDropDown);
			sel.selectByVisibleText(prop.getProperty("electricity_plan"));
		}
		
		public boolean selectEconomyMeterYes() {
			
			economyMeterYes.click();
			return economyMeterYes.isEnabled();
		}
		
		public boolean selectEconomyMeterNo() {
			
			economyMeterNo.click();
			return economyMeterNo.isEnabled();
		}
		
		public void selectElectricityPaymentMethodDropDown() {
			
			Select sel = new Select(electricityPaymentMethodDropDown);
			sel.selectByVisibleText(prop.getProperty("electricity_payment_method"));
		}
		
		public boolean selectElectricityMainSourceHeatingYes() {
			
			electricityMainSourceHeatingYes.click();
			return electricityMainSourceHeatingYes.isEnabled();
		}
		
		public boolean selectElectricityMainSourceHeatingNo() {
			
			electricityMainSourceHeatingNo.click();
			return electricityMainSourceHeatingNo.isEnabled();
		}
		
		public boolean selectElectricityUsagekWh() {
			
			electricityUsagekWhCheckBox.click();
			return electricityUsagekWhCheckBox.isEnabled();
		}
		
		public void selectElectricityUsagekWhValue() {
			
			electricityUsagekWhValue.sendKeys(prop.getProperty("kWh_electricity"));
		}
		
		public void selectElectricityUsageDropDown() {
			
			Select sel = new Select(electricityUsageDropDown);
			sel.selectByValue(prop.getProperty("electricity_usage"));
		}
		
		public boolean selectElectricityUsagePound() {
			
			electricityUsagePound.click();
			return electricityUsagePound.isEnabled();
		}
		
		public void selectElectricityUsagePoundValue() {
			
			electricityUsagePoundValue.sendKeys(prop.getProperty("electricity_cost_pound"));
		}
		
		public void selectElectricitySpendDropDown() {
			
			Select sel = new Select(electricitySpendDropDown);
			sel.selectByValue(prop.getProperty("electricity_spent_period"));
		}
		
		public void selecteconomyElectricityUsageDay() {
			
			economyElectricityUsageDay.sendKeys(prop.getProperty("economy_electricity_usage_day"));
		}
		
		public void selecteconomyElectricityUsageNight() {
			
			economyElectricityUsageNight.sendKeys(prop.getProperty("economy_electricity_usage_night"));
		}
		
		public void selecteconomyElectricityUsageDropDown() {
			
			Select sel = new Select(economyElectricityUsageDropDown);
			sel.selectByVisibleText(prop.getProperty("economy_electricity_spent_period"));
		}
		
		public void selectElectricityBillDate() {
			calender.click();
			previousMonth.click();
			WebElement dateWidget = calenderTable;
			  List <WebElement> rows= dateWidget.findElements(By.tagName("tr"));
			  List <WebElement> columns=  dateWidget.findElements(By.tagName("td"));
			  
			  for (WebElement cell: columns){
			    if (cell.getText().equals(prop.getProperty("date"))){
			    	
			   cell.click();
				 break;
			   }
			  }  
		}
		
		public void selectGasTariffDropDown() {
			
			Select sel = new Select(gasTariffDropDown);
			sel.selectByVisibleText(prop.getProperty("gas_plan"));
		}
		
		public void selectGasPaymentMethodDropDown() {
			
			Select sel = new Select(gasPaymentMethodDropDown);
			sel.selectByVisibleText(prop.getProperty("gas_payment_method"));
		}
		
		public boolean selectGasMainSourceHeatingYes() {
			
			gasMainSourceHeatingYes.click();
			return gasMainSourceHeatingYes.isEnabled();
		}
		
		public boolean selectGasMainSourceHeatingNo() {
			
			gasMainSourceHeatingNo.click();
			return gasMainSourceHeatingNo.isEnabled();
		}
		
		public boolean selectGasUsagekWh() {
			
			gasUsagekWhCheckBox.click();
			return gasUsagekWhCheckBox.isEnabled();
		}
		
		public void selectGasUsagekWhValue() {
			
			gasUsagekWhValue.sendKeys(prop.getProperty("kWh_gas"));
		}
		
		public void selectGasUsagedropDown() {
			
			Select sel = new Select(gasUsagedropDown);
			sel.selectByValue(prop.getProperty("gas_usage"));
		}
		
		public boolean selectGasUsagePound() {
			
			gasUsagePoundCheckBox.click();
			return gasUsagePoundCheckBox.isEnabled();
		}
		
		public void selectGasUsagePoundValue() {
			
			gasUsagePoundValue.sendKeys(prop.getProperty("gas_cost_pound"));
		}
		
		public void selectGasSpendDropDown() {
			
			Select sel = new Select(gasSpendDropDown);
			sel.selectByVisibleText(prop.getProperty("gas_spent_period"));
			
		}
		
		public void selectGasBillDate() {
			gascalender.click();
			gaspreviousMonth.click();
			WebElement dateWidget = gascalenderTable;
			  List <WebElement> rows= dateWidget.findElements(By.tagName("tr"));
			  List <WebElement> columns=  dateWidget.findElements(By.tagName("td"));
			  
			  for (WebElement cell: columns){
			    if (cell.getText().equals(prop.getProperty("gas_date"))){
			    	
			    	cell.click();
			    	break;
			   }
			  }  
		}
		
		
		public boolean selectPrePaymentMeterYesCheckBox() {
			
			prePaymentMeterYesCheckBox.click();
			return prePaymentMeterYesCheckBox.isEnabled();
		}
		
		public boolean selectPrePaymentMeterNoCheckBox() {
			
			prePaymentMeterNoCheckBox.click();
			return prePaymentMeterNoCheckBox.isEnabled();
		}
		
		public void enterCurrentSpendOnElectricity() {
			
			currentSpendOnElectricity.sendKeys(prop.getProperty("amount_spend_on_electricity"));
		}
		
		public void selectElectricityCurrentSpendPeriod() {
			
			Select sel = new Select(electricityCurrentSpendPeriod);
			sel.selectByVisibleText(prop.getProperty("electricity_current_spent_period"));
		}
		
		public boolean selectIDontKnowSpendOnElectricityCheckBox() {
			
			IDontKnowSpendOnElectricityCheckBox.click();
			return IDontKnowSpendOnElectricityCheckBox.isEnabled();
		}

		public void enterCurrentSpendOnGas() {
			String spendongas = prop.getProperty("amount_spend_on_gas");
			currentSpendOnGas.sendKeys(spendongas);
		}
		
		public void selectGasCurrentSpendPeriod() {
			
			Select sel = new Select(gasCurrentSpendPeriod);
			sel.selectByVisibleText(prop.getProperty("gas_current_spent_period"));
		}
		
		public boolean selectIDontKnowSpendOnGasCheckBox() {
			
			IDontKnowSpendOnGasCheckBox.click();
			return IDontKnowSpendOnGasCheckBox.isEnabled();
		}
		
		public void clickNextsuppy() {
			
			nextButton.click();
		}
		
		public void clickYourDetails() {
			
			clickYourDetails.click();
				
		}
		
		public CEYourDetailsPage clickNext() {
			
			nextButton.click();
			return new CEYourDetailsPage();
			
		}
		
		public boolean selectsizeOfHome() {
			
			sizeOfHome.click();
			return sizeOfHome.isEnabled();
		}
		
		public boolean selectNoOfOccupants() {
			
			noOfOccupants.click();
			return noOfOccupants.isEnabled();
		}
		
		public boolean selectMainSourceForHetingGas() {
			
			mainSourceForHetingGas.click();
			return mainSourceForHetingGas.isEnabled();
		}
		public boolean selectAtHomeTemperate() {
			
			atHomeTemperate.click();
			return atHomeTemperate.isEnabled();
		}
		public boolean selectinsulationAtHome() {
			
			insulationAtHome.click();
			return insulationAtHome.isEnabled();
		}
		public boolean selectmainSourceForCookingGas() {
			
			mainSourceForCookingGas.click();
			return mainSourceForCookingGas.isEnabled();
		}
		public boolean selectsomeoneAtHomeMostOfTheTime() {
			
			someoneAtHomeMostOfTheTime.click();
			return someoneAtHomeMostOfTheTime.isEnabled();
		}
}

