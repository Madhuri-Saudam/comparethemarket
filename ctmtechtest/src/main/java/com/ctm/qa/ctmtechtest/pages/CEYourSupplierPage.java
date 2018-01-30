package com.ctm.qa.ctmtechtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ctm.qa.ctmtechtest.base.*;

public class CEYourSupplierPage extends TestBase{
	
	TestBase testbase;
	
	//PageFactory
	@FindBy(xpath = "//*[@id=\"your-postcode\"]")
	WebElement postcode;
	
	@FindBy(xpath = "//span[@class = 'icon have-bill-yes']")
	WebElement yesIHaveMyBill;
	
	@FindBy(xpath = "/html/body/div/div/main/section[1]/fieldset[2]/div/div/label[2]/span")
	WebElement noIDontHaveMyBill;
	
	@FindBy(xpath = "//span[@class = 'icon energy-gas-electricity']")
	WebElement gasAndElectricity;
	
	@FindBy(xpath = "//span[@class = 'icon energy-electricity']")
	WebElement electricityOnly;
	
	@FindBy(xpath = "//span[@class = 'icon energy-gas']")
	WebElement gasOnly;
	
	@FindBy(xpath = "/html/body/div/div/main/section[2]/fieldset[1]/div/div/label[2]/span")
	WebElement sameSupplierNo;
	
	@FindBy(xpath = "//*[@id=\"sel1\"]")
	WebElement energyElectricityDropDown;
	
	@FindBy(xpath = "//*[@id=\"sel2\"]")
	WebElement energyGasDropDown;
	
	@FindBy(xpath = "//span[@class = 'icon top-6-british-gas']")
	WebElement britishGas;
	
	@FindBy(xpath = "//*[@id=\"sel2\"]']")
	WebElement gasDropDown;
	
	@FindBy(xpath = "/html/body/div/div/main/section[2]/fieldset[3]/div/div/div[1]/label[3]/span/span")
	WebElement eonEnergy;
	
	@FindBy(xpath ="//input[@id = 'gas-supplier-dont-know']")
	WebElement IDontKnowGasSupplierCheck;
	
	@FindBy(xpath ="//input[@id = 'electricity-supplier-dont-know']")
	WebElement IDontKnowElectricitySupplierCheck;
	
	@FindBy(xpath = "//button[@id = 'goto-your-supplier-details']")
	WebElement nextBUtton;
	
	// Initialization
	public CEYourSupplierPage() {
		
		PageFactory.initElements(driver, this);	
		testbase = new TestBase();
	}
	
	//Actions
	
	public String getCEYourSupplierPageTitle() {
		
		return driver.getTitle();
	}
	
	public void enterPostCode() {
		
		String str = prop.getProperty("post_code");		
		postcode.sendKeys(str);
	}
	
	public boolean clickYesIHaveMyBill() {
		
		yesIHaveMyBill.click();
		return yesIHaveMyBill.isEnabled();
	}
	
	public boolean clickNoIDontHaveMyBill() {
		
		noIDontHaveMyBill.click();
		return noIDontHaveMyBill.isEnabled();	
	}

	public boolean selectGasandElectricity() {
	
	gasAndElectricity.click();
	return gasAndElectricity.isEnabled();
	}

	public boolean selectGasOnly() {
	
	gasOnly.click();
	return gasOnly.isEnabled();
	}

	public boolean selectElectricityOnly() {
	
	electricityOnly.click();
	return electricityOnly.isEnabled();
	}
	
	public boolean selectNotSameSupplier() {
		
	sameSupplierNo.click();
	return sameSupplierNo.isEnabled();
	}
	
	public void selectEnergyElectric() {
		Select sel = new Select(energyElectricityDropDown);
		sel.selectByVisibleText(prop.getProperty("electricity_supplier"));
	}
	
	public void selectEnergyGas() {
		
		Select sel = new Select(energyGasDropDown);
		sel.selectByVisibleText(prop.getProperty("gas_supplier"));
	}
	
	public boolean selectEngerySupplierGas() {
		
		britishGas.click();
		return britishGas.isEnabled();
	}
	
	public boolean selectEngerySupplierElectricity() {
		eonEnergy.click();
		return eonEnergy.isEnabled();
	}
	
	public boolean selectiDontKnowGas() {
		
		IDontKnowGasSupplierCheck.click();
		return IDontKnowGasSupplierCheck.isEnabled();
	}
	
	public boolean selectiDontKnowElectricity() {
		
		IDontKnowElectricitySupplierCheck.click();
		return IDontKnowElectricitySupplierCheck.isEnabled();
	}
	
	public CEYourEnergyPage clickNext() {
		
		nextBUtton.click();
		return new CEYourEnergyPage();
		
	}

}
