package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath = "//input[@id='Email']")public WebElement email;
	@FindBy(xpath = "//input[@id='Password']")public WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")public WebElement login;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")public WebElement logout;
	
}
