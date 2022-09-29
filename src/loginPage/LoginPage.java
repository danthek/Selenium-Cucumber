package loginPage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginPage {



	public void typeUserName(WebDriver driver, String userName) throws InterruptedException {
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		Thread.sleep(1000);
	}

	public void typePassword(WebDriver driver, String password) throws InterruptedException {
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.quit();
	}

	public void wrongCredentials(WebDriver driver, String userName, String password) throws InterruptedException {
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(1000);
	}

	public void clickSubmitButton(WebDriver driver) throws InterruptedException {
		driver.findElement(By.className("signInBtn")).click(); // if the class is like this :"submit signInBtn ", just
		Thread.sleep(3000);
	}

	public void forgotPassword(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
