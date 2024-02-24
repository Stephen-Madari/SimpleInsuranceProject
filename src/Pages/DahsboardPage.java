package Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Pages.Utilities.BaseClass.*;

public class DahsboardPage {

	WebDriver driver;

	@FindBy(xpath = "//span[text()='New']")
	WebElement newbutton;

	@FindBy(xpath = "//span[text()='Import']")
	WebElement importButton;

	@FindBy(xpath = "(//div[@aria-haspopup='listbox'])[1]")
	WebElement search;

	@FindBy(xpath = "//li[@data-value='policy_number']")
	WebElement policyNumber;

	@FindBy(xpath = "(//input[@aria-invalid='false'])[1]")
	WebElement input;

	@FindBy(xpath = "//span[text()='Policy number: 200000398070']")
	WebElement check;

	@FindBy(xpath = "//*[@data-testid='ExpandMoreIcon']")
	WebElement filter;
	
	@FindBy(xpath="//*[contains(text(), '/policy/details?id=']")
	WebElement text;

	public DahsboardPage(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void createInsurance() throws InterruptedException {
		// clickElement(newbutton);
		actionsClick(driver, newbutton);
	}

	public void importFlow() throws InterruptedException {
		actionsClick(driver, importButton);
	}

	public void searching() throws InterruptedException {
		actionsClick(driver, search);
		actionsClick(driver, policyNumber);

		input.sendKeys("200000398070");
		input.sendKeys(Keys.ENTER);

		Assert.assertEquals(check.getText(), "Policy number: 200000398070");

	}
	
	public void filtering() throws InterruptedException
	{

		Thread.sleep(3000);
		actionsClick(driver, filter);
		//a[@href="/policy/details?id=200000398014"]
		
		List<WebElement> e = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall css-1s251lj']"));
		System.out.println(e.size());	
		
		ArrayList<String> obtainedList = new ArrayList<>(); 
		
		for(int i=0;i<e.size();i++)
		{
			obtainedList.add(((WebElement) e).getText());
		}
		
	
		ArrayList<String> sortedList = new ArrayList<>();   
		for(String s:obtainedList){
		sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
	}

}
