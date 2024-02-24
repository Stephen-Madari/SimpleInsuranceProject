package Pages;

import java.lang.reflect.Constructor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.network.model.WebSocketWillSendHandshakeRequest;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Pages.Utilities.BaseClass.*;


public class CustomerPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='input-createCertificate_firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-createCertificate_lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-createCertificate_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-createCertificate_streetName']")
	WebElement Street;
	
	@FindBy(xpath="//input[@id='input-createCertificate_streetNumber']")
	WebElement houseNumber;
	
	@FindBy(xpath="//input[@id='input-createCertificate_zip']")
	WebElement postalCode;
	
	@FindBy(xpath="//input[@id='input-createCertificate_city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='input-createCertificate_country']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='input-createCertificate_taxCode']")
	WebElement taxCode;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextButton;
	

	
	public CustomerPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FillCustomerDetails() throws InterruptedException
	{
		firstName.sendKeys("First Name");
		lastName.sendKeys("Last Name");
		email.sendKeys("firstname.lastname@email.com");
		Street.sendKeys("Street");
		houseNumber.sendKeys("123");
		postalCode.sendKeys("123");
		city.sendKeys("ABC");
		country.sendKeys("GB");
		taxCode.sendKeys("123");
		Thread.sleep(3000);
		actionsClick(driver,nextButton);

	}
	
}
