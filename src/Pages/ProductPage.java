package Pages;

import java.lang.reflect.Constructor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Pages.Utilities.BaseClass.*;


public class ProductPage {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id='country-select']")
	WebElement country;

	@FindBy(xpath = "//li[@data-value='ES']")
	WebElement countryName;

	@FindBy(xpath = "//div[@id='product-name-select']")
	WebElement product;

	@FindBy(xpath = "//li[@data-value='Nokia_v1Allianz_global']")
	WebElement productName;

	@FindBy(xpath = "//input[@name='tariff-name-select']")
	WebElement tariff;

	@FindBy(xpath = "//li[@data-value='1-34-Nokia_v1Allianz_global-D-EUR-v1-Accidental_damage']")
	WebElement tariffName;

	@FindBy(xpath = "//input[@name='category-name-select']")
	WebElement insuranceCategory;

	@FindBy(xpath = "//li[@data-value='CATEGORY_SMARTPHONE']")
	WebElement insuranceCatergoryName;

	@FindBy(xpath = "//label[@id='duration-select-label']")
	WebElement period;

	@FindBy(xpath = "//li[@data-value='12 month(s)']")
	WebElement periodName;

	@FindBy(xpath = "//div[@id='frequency-select']")
	WebElement payment;

	@FindBy(xpath = "//li[@data-value='12 month(s)']")
	WebElement paymentName;

	@FindBy(xpath = "//div[@id='class-name-select']")
	WebElement classname;

	@FindBy(xpath = "//li[@data-value='PDCODE677395']")
	WebElement classnameSelect;

	@FindBy(xpath = "//input[@id='input-createCertificate_serialNumber']")
	WebElement serialNumber;

	@FindBy(xpath = "//input[@id='input-createCertificate_deviceName']")
	WebElement deviceName;

	@FindBy(xpath = "//input[@id='input-createCertificate_invoiceNumber']")
	WebElement invoiceNumber;

	@FindBy(xpath = "//input[@id='input-createCertificate_orderNumber']")
	WebElement orderNumber;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;
	
	public ProductPage(WebDriver driver) {

		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void FillProductDetails() throws InterruptedException
	{
		actionsClick(driver,country);
		actionsClick(driver,countryName);
		actionsClick(driver,product);
		actionsClick(driver,productName);
		actionsClick(driver,tariff);
		actionsClick(driver,tariffName);
		actionsClick(driver,insuranceCategory);
		actionsClick(driver,insuranceCatergoryName);
		actionsClick(driver,period);
		actionsClick(driver,periodName);
		actionsClick(driver,payment);
		actionsClick(driver,paymentName);
		actionsClick(driver,classname);
		actionsClick(driver,classnameSelect);
		serialNumber.sendKeys("12345678");
		deviceName.sendKeys("ABC");
		invoiceNumber.sendKeys("12345678");
		orderNumber.sendKeys("12345");
		actionsClick(driver,nextButton);
		
		
		
		
		
	}
	
	
	
	
	

}
