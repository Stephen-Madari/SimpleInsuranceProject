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

public class OrderSummary {

WebDriver driver;
	
	@FindBy(xpath="//input[@value='STRIPE.CARD']")
	WebElement creditCard;
	
	
	@FindBy(xpath="//input[@value='STRIPE.DIRECT_DEBIT']")
	WebElement directDebit;
	
	
	@FindBy(xpath="//span[@class='MuiButton-label']")
	WebElement paynowButton;
	
	public OrderSummary(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void CreditCardOption() throws InterruptedException
	{
			
		actionsClick(driver, creditCard);
		actionsClick(driver, paynowButton);
		Thread.sleep(3000);
	}
	
	
	public void directDebitPayment() throws InterruptedException
	{
			
		actionsClick(driver, directDebit);
		actionsClick(driver, paynowButton);
	}
	
	
	
	
}
