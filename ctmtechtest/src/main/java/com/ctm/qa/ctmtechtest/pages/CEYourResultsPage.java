package com.ctm.qa.ctmtechtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctm.qa.ctmtechtest.base.TestBase;

public class CEYourResultsPage extends TestBase {
	
	
	@FindBy(xpath = "//button[@class = 'filter-results-mobile ng-scope']")
	WebElement filtersButton;
	
	@FindBy(xpath = "//div[@class = 'tariff-type-button']")
	WebElement tariffType;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div[1]/div/label[1]/span[2]")
	WebElement tariffTypeFixed;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div[1]/div/label[2]/span[2]")
	WebElement tariffTypeVariable;
	
	@FindBy(xpath = "//div[@class = 'payment-type-button']")
	WebElement paymentType;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div[2]/div/div/label[1]/span[2]")
	WebElement paymentTypeMonthly;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div[2]/div/div/label[2]/span[2]")
	WebElement paymentTypeQuarterly;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div[2]/div/div/label[3]/span[2]")
	WebElement payOnReceiptOfBill;
	
	@FindBy(xpath = "//div[@class = 'supplier-rating-button']")
	WebElement starring;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div[3]/div/label[1]/span[2]")
	WebElement superStarring;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div[3]/div/label[2]/span[2]")
	WebElement starRatingFour;
	
	@FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[2]/div[3]/div/label[3]/span[2]")
	WebElement starRatingThree;
	
	
public CEYourResultsPage() {
		
		PageFactory.initElements(driver, this);		
	}
	

// Actions
	public String getCEYourResultsPageTitle() {
	
		return driver.getTitle();
	}

	
	public boolean selectFiltersButton() {
	
		filtersButton.click();
		return filtersButton.isEnabled();
	}

	public boolean selectTariffType() {
	
		tariffType.click();
		return tariffType.isEnabled();
	}

	public boolean selectTariffTypeFixed() {
		tariffTypeFixed.click();
		return tariffTypeFixed.isEnabled();
	}

	public boolean selectTariffTypeVariable() {
		
		tariffTypeVariable.click();
		return tariffTypeVariable.isEnabled();
	}
	
	public boolean selectPaymentType() {
		
		paymentType.click();
		return paymentType.isEnabled();
	}
	
	public boolean selectPaymentTypeMonthly() {
		
		paymentTypeMonthly.click();
		return paymentTypeMonthly.isEnabled();
	}
	
	public boolean selectPaymentTypeQuarterly() {
		
		paymentTypeQuarterly.click();
		return paymentTypeQuarterly.isEnabled();
	}
	
	public boolean selectPayOnReceiptOfBill() {
		
		payOnReceiptOfBill.click();
		return payOnReceiptOfBill.isEnabled();
	}
	
	public boolean selectStarring() {
		
		starring.click();
		return starring.isEnabled();
	}
	
	public boolean selectSuperStarring() {
		
		superStarring.click();
		return superStarring.isEnabled();
	}

	public boolean selectStarRatingFour() {
	
		starRatingFour.click();
		return starRatingFour.isEnabled();
	}

	public boolean selectStarRatingThree() {
	
		starRatingThree.click();
		return starRatingThree.isEnabled();
	}

}
