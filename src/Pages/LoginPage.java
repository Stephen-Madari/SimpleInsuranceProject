package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Pages.Utilities.BaseClass.*;

public class LoginPage {

	WebDriver driver;

	String URL = "https://insurance-manager.sb-qa-candidatetask.sisu.sh/login";

	@FindBy(xpath = "//input[@id='login_username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='login_password']")
	WebElement password;

	@FindBy(xpath = "")
	WebElement Element;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//h5[text()='Insurance Manager']")
	WebElement pageHeader;

	@FindBy(xpath = "//*[@data-testid='LanguageIcon']")
	WebElement languageIcon;

	@FindBy(xpath = "//span[text()='Englisch']")
	WebElement english;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String username, String password) throws InterruptedException {
		driver.get(URL);
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		actionsClick(driver, loginButton);

	}

	public void translate() throws InterruptedException {
		clickElement(languageIcon);
		Thread.sleep(2000);
		clickElement(english);

	}

}
