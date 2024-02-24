package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DahsboardPage;
import Pages.LoginPage;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import static Pages.Utilities.BaseClass.*;

public class LoginTest {

	
		
	WebDriver driver = new ChromeDriver();

	LoginPage objLP = new LoginPage(driver);
	DahsboardPage objDP = new DahsboardPage(driver);

	
	@Test(priority=1)
	public void Login() throws InterruptedException {
		driver.get("https://insurance-manager.sb-qa-candidatetask.sisu.sh/login");

		objLP.translate();
		objLP.login("testsellingpartner6@simplesurance.de", "TestSellingPartner6Pass");
		
		Thread.sleep(3000);
		//objDP.createInsurance();
	}
	
	@Test(priority=2)
	public void createInsurance() throws InterruptedException
	{
		objDP.createInsurance();
		
	}
	
	
	

//	@AfterTest
//	public void close() {
//		driver.close();
//	}

}
