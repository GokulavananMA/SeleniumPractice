package flipkartPractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ssWebElement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		WebElement img = driver
				.findElement(By.xpath("//img[@alt='Spring Boot Fundamentals with Unit Testing (MockMVC/Mockito)']"));

		File path = new File("./Screenshots/SS_WE1.png");
		File ss = img.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, path);
		Thread.sleep(3000);

		driver.close();

	}

}
