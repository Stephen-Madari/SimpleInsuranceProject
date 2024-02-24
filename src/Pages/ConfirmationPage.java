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

import org.openqa.selenium.By;

public class ConfirmationPage {
	WebDriver driver;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement checkBox1;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement checkBox2;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	WebElement checkBox3;
	
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	WebElement checkBox4;
	
	@FindBy(xpath="//span[text()='Create insurance']")
	WebElement createInsuranceButton;
	

	public ConfirmationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void check() throws InterruptedException
	{
		checkBox1.click();
		checkBox2.click();
		checkBox3.click();
		checkBox4.click();
		
		actionsClick(driver, createInsuranceButton);
		
		Thread.sleep(5000);
	}
}
