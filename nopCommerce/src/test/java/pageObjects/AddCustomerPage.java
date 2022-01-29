package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

public WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//p[contains(text(), 'Customers')])[1]") public WebElement customers;
	@FindBy(xpath = "(//p[contains(text(), 'Customers')])[2]") public WebElement customersItem;
	@FindBy(xpath = "//a[@class='btn btn-primary']") public WebElement addNewButton;
	@FindBy(xpath = "//input[@id='Email']") public WebElement addEmail;
	@FindBy(xpath = "//input[@id='Password']") public WebElement addPassword;
	@FindBy(xpath = "//input[@id='FirstName']") public WebElement addFirstName;
	@FindBy(xpath = "//input[@id='LastName']") public WebElement addLastName;
	@FindBy(xpath = "//input[@id='Gender_Female']") public WebElement addGenderFemale;
	@FindBy(xpath = "//input[@id='Gender_Male']") public WebElement addGenderMale;
	@FindBy(xpath = "//input[@id='DateOfBirth']") public WebElement addDOB;
//	@FindBy(xpath = "//input[@id='DateOfBirth']") public WebElement addDOB;
	
}
