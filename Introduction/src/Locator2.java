
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out

		String name = "rahul";

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();

		String password = getPassword(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");// its is
																												// used
																												// to
																												// check
																												// the
																												// condition
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();// it for xpath or else -> //*[text()='Log Out']
		driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();// 3rd way of creating css selector
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login
		String[] passwordArray = passwordText.split("'");// it will split and act as array to store the string.
		String password = passwordArray[1].split("'")[0];
		// another way of creation (I)String[]
		// passwordArray2=passwordArray[1].split("'"); (II)passwordArray2[0];

		// 0th index - Please use temporary password
		// 1st index - rahulshettyacademy' to Login

		// passwordArray[1].split("'");it will separate - rahulshettyacademy' Login
		// 0th index - the rahulshettyacademy
		// 1st index - to Login.

		return password;

	}

}
