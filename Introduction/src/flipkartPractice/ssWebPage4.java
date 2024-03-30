package flipkartPractice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ssWebPage4 {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File path = new File("./Screenshots/webpage5.png");
		File ss = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, path);
		Thread.sleep(3000);
		driver.close();
	}
}
