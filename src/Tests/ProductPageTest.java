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
import Pages.ProductPage;

import static Pages.Utilities.BaseClass.*;

@Test(priority = 3)
public class ProductPageTest {

	WebDriver driver = new ChromeDriver();

	ProductPage objPP = new ProductPage(driver);
	
	DahsboardPage obhDP = new DahsboardPage(driver);
	
	public void FillProduceDetails() throws InterruptedException
	{
		objPP.FillProductDetails();
		
	}
	
	
}
