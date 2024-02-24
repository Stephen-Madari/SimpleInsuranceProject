package Pages;

import static Pages.Utilities.BaseClass.actionsClick;

import java.lang.reflect.Constructor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.network.model.WebSocketWillSendHandshakeRequest;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailsPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='cardnumber']")
	WebElement cardnumber;

	@FindBy(xpath = "(//input[@inputmode='numeric'])[1]")
	WebElement enterCardnumber;

	@FindBy(xpath = "//*[@name='exp-date']")
	WebElement expdate;

	@FindBy(xpath = "//*[@name='cvc']")
	WebElement cvv;
	
	
	@FindBy(xpath="//input[@name='accountHolder']")
	WebElement accountHolder;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='iban']")
	WebElement iban;
	
	@FindBy(xpath = "//input[@class='jss120']")
	WebElement check;

	@FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
	WebElement paybutton;
	
	

	public PaymentDetailsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void creditCardPayment() throws InterruptedException {

		driver.switchTo().frame(0);
		actionsClick(driver, cardnumber);
		enterCardnumber.sendKeys("4242424242424242");
		expdate.sendKeys("10/24");
		cvv.sendKeys("123");
		driver.switchTo().defaultContent();
		actionsClick(driver, paybutton);
		Thread.sleep(5000);
	}
	
	
	public void directDebitPayment() throws InterruptedException
	{
		accountHolder.sendKeys("Account Holder");
		email.sendKeys("firstname.ladtname@email.com");
		
		driver.switchTo().frame(0);
		
		iban.sendKeys("DE89370400440532013000");
		driver.switchTo().defaultContent();
		
		check.click();
		actionsClick(driver, paybutton);
		Thread.sleep(5000);
	}

}
