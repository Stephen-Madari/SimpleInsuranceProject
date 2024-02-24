package Pages.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BaseClass {

	WebDriver driver;

	public BaseClass(WebDriver driver) {

		this.driver = driver;
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void actionsClick(WebDriver driver, WebElement element) throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
	}

	public static void verifyText(WebElement element, String expected) {
		Assert.assertEquals(element.getText(), expected);

	}

}
