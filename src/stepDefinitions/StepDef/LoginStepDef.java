package stepDefinitions.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	public static WebDriver driver; // we use this so we dont open a new browser tan on each step

	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Abraham\\\\Documents\\\\Danthek\\\\Automated QA Tools\\\\Browser Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
	}

	@When("^Enter valid userName$")
	public void enter_search_criteria() throws Throwable {
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		Thread.sleep(1000);
	}

	@Then("^Type the correct Password$")
	public void click_on_search_button() throws Throwable {
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(3000);
		driver.quit();
	}

	//////////////////////////BAD CREDS AND RESET PASSWORD//////////////////////////////

	@Given("^Open browser and visit site$")
	public void open_browser_and_visit_site() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Abraham\\\\Documents\\\\Danthek\\\\Automated QA Tools\\\\Browser Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
	}

	@When("^Enter wrong userName$")
	public void Enter_wrong_userName() throws Throwable {
		driver.findElement(By.id("inputUsername")).sendKeys("Abraham");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		Thread.sleep(1000);
	}

	@Then("^Type the wrong Password$")
	public void Type_the_wrong_Password() throws Throwable {
		driver.findElement(By.className("signInBtn")).click(); // if the class is like this :"submit signInBtn ", just
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
