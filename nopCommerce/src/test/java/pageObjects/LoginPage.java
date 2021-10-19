package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 

	@FindBy(xpath = "//input[@id='Email']")
	public static WebElement email;
	@FindBy(xpath = "//input[@id='Password']")
	public static WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public static WebElement loginButton;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public static WebElement logout;

}
