package Pages;

import static Pages.Utilities.BaseClass.actionsClick;
import static org.testng.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.network.model.WebSocketWillSendHandshakeRequest;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InsuranceDetailsPage {

	WebDriver driver;

	@FindBy(xpath = "//span[text()='Created']")
	WebElement created;
	
	@FindBy(xpath="//span[text()='Insurance details']")
	WebElement insuranceDetails;
	
	@FindBy(xpath="//span[text()=\"List\"]")
	WebElement listText;
	
	public InsuranceDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void InsuranceDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(created.getText(), "Created");
		Assert.assertEquals(insuranceDetails.getText(), "Insurance details");

		listText.click();
	}
	
	
	
}
