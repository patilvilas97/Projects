package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath = "//input[@id='Email']")public static WebElement email;
	@FindBy(xpath = "//input[@id='Password']")public static WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")public static WebElement login;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")public static WebElement logout;
	
}
