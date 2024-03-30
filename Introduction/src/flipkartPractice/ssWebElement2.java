package flipkartPractice;


import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ssWebElement2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		WebElement offer = driver.findElement(By.id("offers-link"));

		File path = new File("./Screenshots/SS_WE2.png");
		File ss = offer.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, path);
		Thread.sleep(3000);
		driver.close();

	}

}
