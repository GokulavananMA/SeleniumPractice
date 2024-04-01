import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// implecit wait
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("gokul");
		driver.findElement(By.name("inputPassword")).sendKeys("gokul123");
		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());// 1st way css selector for error
																					// message
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Gokulavanan");// 1st way of creating
																								// xpath

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Gokulavanan31@gmail.com");// second
																												// way
																												// for
																												// css
																												// selector

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();// 2nd way of creating xpath

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Gokulavanan315@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9677876444");// 3rd way of creating xpath

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();// 3rd way of creating css selector

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());// 4th way of creating css selector

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Gokulavanan");// css id

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("gokulJAMES@123");// 4 th type css

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		// other type of xpath it conitain all part of xpath
		// //div[@class='forgot-pwd-btn-container']/button[1]

	}

}
