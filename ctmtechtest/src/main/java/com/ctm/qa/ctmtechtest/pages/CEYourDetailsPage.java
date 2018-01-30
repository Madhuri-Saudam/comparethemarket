package com.ctm.qa.ctmtechtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ctm.qa.ctmtechtest.base.TestBase;

public class CEYourDetailsPage  extends TestBase{
	
	//Page Factory
	@FindBy(xpath = "//span[@class = 'icon fixed-rate-1']")
	WebElement fixedTariff;
	
	@FindBy(xpath = "//span[@class = 'icon variable-bill-1']")
	WebElement variableTariff;
	
	@FindBy(xpath = "//span[@class = 'icon tariff-all']")
	WebElement allTarrif;
	
	@FindBy(xpath = "//span[@class = 'icon annual-1']")
	WebElement monthlyDirectDebit;
	
	@FindBy(xpath = "//span[@class = 'icon quarterly-1']")
	WebElement quarterlyDirectDebit;
	
	@FindBy(xpath = "//span[@class = 'icon bill-1']")
	WebElement payOnReceiptOfBill;
	
	@FindBy(xpath = "//span[@class = 'icon payment-all']")
	WebElement allPaymentTypes;
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath = "//span[@class =]")
	WebElement agreeMarketingInfoCheck;
	
	@FindBy(xpath = "/html/body/div/div/main/div/fieldset[3]/div/div[2]/label/span[2]")
	WebElement agreeTermsAAndConditionsCheck;
	
	@FindBy(xpath = "//*[@id=\"email-submit\"]")
	WebElement goToPrices;
	
	
public CEYourDetailsPage() {
		
		PageFactory.initElements(driver, this);		
	}
	

    //Actions
	public String getCEYourDetailsPageTitle() {
	
		return driver.getTitle();
	}

	public boolean selectFixedTarrif() {
		
		fixedTariff.click();
		return fixedTariff.isEnabled();
	}
	
	public boolean selectVariableTariff() {
		
		variableTariff.click();
		return variableTariff.isEnabled();
	}

	public boolean selectAllTarrif() {
	
		allTarrif.click();
		return allTarrif.isEnabled();
	}

	public boolean selectMonthlyDirectDebit() {
	
		monthlyDirectDebit.click();
		return monthlyDirectDebit.isEnabled();
	}

	public boolean selectQuarterlyDirectDebit() {
	
		quarterlyDirectDebit.click();
		return quarterlyDirectDebit.isEnabled();
	}

	public boolean selectPayOnReceiptOfBill() {
	
		payOnReceiptOfBill.click();
		return payOnReceiptOfBill.isEnabled();
	}

	public boolean selectAllPaymentTypes() {
	
		allPaymentTypes.click();
		return allPaymentTypes.isEnabled();
	}
	
	public void enterEmail() {
		
		email.sendKeys(prop.getProperty("email_address"));
	}
	
	public boolean selectAgreeMarketingInfoCheck() {
		
		agreeMarketingInfoCheck.click();
		return agreeMarketingInfoCheck.isEnabled();
	}
	
	public boolean selectAgreeTermsAAndConditionsCheck() {
		
		agreeTermsAAndConditionsCheck.click();
		return agreeTermsAAndConditionsCheck.isEnabled();
	}
	
	public CEYourResultsPage clickGoToPrices() {
		
		goToPrices.click();
		return new CEYourResultsPage();
	}
}
