package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class Steps {
	
	protected static WebDriver driver;
	public LoginPage lp;
	
	@Given("^I launch Chrome Browser$")
	public void i_launch_Chrome_Browser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patil\\Desktop\\Programs\\Projects\\nopCommerce\\Drivers\\chromedriver.exe");  
		driver=new ChromeDriver();
		lp = new LoginPage(driver);
		driver.manage().window().maximize();
	}

	@When("^I open URL \"([^\"]*)\"$")
	public void i_open_URL(String url) throws Exception {
		driver.get(url);
		Thread.sleep(3000);
	}

	@When("^I enter Email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_Email_as_and_password_as(String Email, String password) throws Exception {
		LoginPage.email.clear();
		Thread.sleep(2000);
		LoginPage.email.sendKeys(Email);
		Thread.sleep(2000);
		LoginPage.password.clear();
		Thread.sleep(2000);
		LoginPage.password.sendKeys(password);
		Thread.sleep(2000);
	}

	@When("^I click login$")
	public void i_click_login() throws Exception {
	    LoginPage.loginButton.click();
	}

	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Exception {
	    if(driver.getTitle().equalsIgnoreCase(title)==true) {
	    	System.out.println("Title is verified");
	    }else {
	    	System.out.println("Title is wrong");
	    	driver.close();
	    }
	}

	@When("^I click logout$")
	public void i_click_logout() throws Exception {
	    LoginPage.logout.click();
	}

	@Then("^I close Browser$")
	public void i_close_Browser() throws Exception {
	    driver.close();
	}
}
