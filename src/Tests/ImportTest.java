package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ConfirmationPage;
import Pages.CustomerPage;
import Pages.DahsboardPage;
import Pages.ImportInsurancePage;
import Pages.InsuranceDetailsPage;
import Pages.LoginPage;
import Pages.OrderSummary;
import Pages.PaymentDetailsPage;
import Pages.ProductPage;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import static Pages.Utilities.BaseClass.*;

import javax.security.auth.callback.ConfirmationCallback;

public class ImportTest {

	WebDriver driver = new ChromeDriver();

	LoginPage objLP = new LoginPage(driver);
	DahsboardPage objDP = new DahsboardPage(driver);
	ProductPage objPP = new ProductPage(driver);
	CustomerPage objCP = new CustomerPage(driver);
	ConfirmationPage objCop = new ConfirmationPage(driver);
	OrderSummary objOS = new OrderSummary(driver);
	PaymentDetailsPage objPD = new PaymentDetailsPage(driver); 
	InsuranceDetailsPage objIDP = new InsuranceDetailsPage(driver);
	ImportInsurancePage objIIP = new ImportInsurancePage(driver);
	
	
	@Test(priority = 1)
	public void FinalRun() throws InterruptedException {
		driver.get("https://insurance-manager.sb-qa-candidatetask.sisu.sh/login");

		objLP.translate();
		objLP.login("testsellingpartner6@simplesurance.de", "TestSellingPartner6Pass");

		Thread.sleep(3000);
		// objDP.createInsurance();
	}

	@Test(priority = 2)
	public void importFlow() throws InterruptedException {
		objDP.importFlow();

	}
	
	@Test(priority = 3)
	public void importInsurance() throws InterruptedException {
		objIIP.fileupload();

	}

}
