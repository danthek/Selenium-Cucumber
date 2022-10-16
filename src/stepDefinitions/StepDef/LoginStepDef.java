package stepDefinitions.StepDef;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import loginPage.LoginPage;

public class LoginStepDef {
	String userName = "";
	String password = "";
	public static WebDriver driver; // we use this so we dont open a new browser tab on each step
	public static LoginPage loginPage = new LoginPage();



	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Abraham\\\\Documents\\\\Danthek\\\\Automated QA Tools\\\\Browser Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(1000);
	
	}

	@When("^Enter valid userName$")
	public void enter_valid_userName() throws Throwable {
		userName = "rahul";
		loginPage.typeUserName(driver, userName);
	}

	@Then("^Type the correct Password$")
	public void type_the_correct_password() throws Throwable {
		password = "rahulshettyacademy";

		loginPage.typePassword(driver, password);

	}

	////////////////////////// BAD CREDS AND RESET
	////////////////////////// PASSWORD//////////////////////////////

	@Given("^Open browser and visit site$")
	public void open_browser_and_visit_site() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Abraham\\\\Documents\\\\Danthek\\\\Automated QA Tools\\\\Browser Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
	}

	@When("^Enter wrong credentials$")
	public void Enter_wrong_credentials() throws Throwable {
		userName = "Abraham";
		password = "hello123";
		loginPage.wrongCredentials(driver, userName, password);

	}

	@And("^click submit button$")
	public void click_submit_button() throws Throwable {
		loginPage.clickSubmitButton(driver);

	}

	@Then("^click on forgot your password$")
	public void click_on_forgot_your_Password() throws Throwable {
		loginPage.forgotPassword(driver);

	}

}
