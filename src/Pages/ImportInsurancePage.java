package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Pages.Utilities.BaseClass.*;


public class ImportInsurancePage {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@data-testid='CloudUploadIcon']")
	WebElement importFile;
	
	
	@FindBy(xpath="//span[text()='Create insurance']")
	WebElement createInsuranceButton;
	
	@FindBy(xpath="//input[@id='input-csv']")
	WebElement inputbutton;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement inputType;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement alert;
	
	
	public ImportInsurancePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fileupload() throws InterruptedException
	{
		inputbutton.sendKeys("C:\\Users\\Stephen\\Downloads\\testdata-qa.csv");
		Thread.sleep(3000);
		createInsuranceButton.click();
		
		Thread.sleep(3000);
		
		System.out.println(alert.getText());
	}
	
	
	
	

}
