package stepDefinitions.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OutLineLoginStepDef {
	public static WebDriver driver; // we use this so we dont open a new browser tan on each step

	@Given("^The user enters the web page$")
	public void The_user_enters_the_web_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Abraham\\\\Documents\\\\Danthek\\\\Automated QA Tools\\\\Browser Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
	}

	@When("^he logins with his name:  (.+)$")
	public void he_logins_with_his_name(String name) throws Throwable {
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		Thread.sleep(1000);
	}

	@Then("^enters the password: (.+)$")
	public void enters_the_password(String password) throws Throwable {
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.quit();
	}

}
